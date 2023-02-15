package com.ruoyi.project.customer.ComContactsOut.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.product.service.impl.ComProductServiceImpl;
import com.ruoyi.project.system.config.service.IConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.ComContactsOut.mapper.ComContactsOutMapper;
import com.ruoyi.project.customer.ComContactsOut.domain.ComContactsOut;
import com.ruoyi.project.customer.ComContactsOut.service.IComContactsOutService;
import com.ruoyi.common.utils.text.Convert;

import javax.validation.Validator;

/**
 * 外部通讯录Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComContactsOutServiceImpl implements IComContactsOutService 
{


    private static final Logger log = LoggerFactory.getLogger(ComContactsOutServiceImpl.class);

    @Autowired
    private IConfigService configService;

    @Autowired
    protected Validator validator;

    @Autowired
    private ComContactsOutMapper comContactsOutMapper;

    /**
     * 查询外部通讯录
     * 
     * @param id 外部通讯录主键
     * @return 外部通讯录
     */
    @Override
    public ComContactsOut selectComContactsOutById(Long id)
    {
        return comContactsOutMapper.selectComContactsOutById(id);
    }

    /**
     * 查询外部通讯录列表
     * 
     * @param comContactsOut 外部通讯录
     * @return 外部通讯录
     */
    @Override
    public List<ComContactsOut> selectComContactsOutList(ComContactsOut comContactsOut)
    {
        return comContactsOutMapper.selectComContactsOutList(comContactsOut);
    }

    /**
     * 新增外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    @Override
    public int insertComContactsOut(ComContactsOut comContactsOut)
    {
        comContactsOut.setCreateTime(DateUtils.getNowDate());
        return comContactsOutMapper.insertComContactsOut(comContactsOut);
    }

    /**
     * 修改外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    @Override
    public int updateComContactsOut(ComContactsOut comContactsOut)
    {
        comContactsOut.setUpdateTime(DateUtils.getNowDate());
        return comContactsOutMapper.updateComContactsOut(comContactsOut);
    }

    /**
     * 批量删除外部通讯录
     * 
     * @param ids 需要删除的外部通讯录主键
     * @return 结果
     */
    @Override
    public int deleteComContactsOutByIds(String ids)
    {
        return comContactsOutMapper.deleteComContactsOutByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除外部通讯录信息
     * 
     * @param id 外部通讯录主键
     * @return 结果
     */
    @Override
    public int deleteComContactsOutById(Long id)
    {
        return comContactsOutMapper.deleteComContactsOutById(id);
    }




    /**
     * 导入数据
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     */
    @Override
    public String importContactsOut(List<ComContactsOut> list, Boolean isUpdateSupport)
    {
        if (StringUtils.isNull(list) || list.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        String operName = ShiroUtils.getLoginName();
        String password = configService.selectConfigByKey("sys.user.initPassword");
        for (ComContactsOut item : list)
        {
            try
            {
                // 验证是否存在这个客户
                ComContactsOut c= comContactsOutMapper.selectComContactsOutByPhone(item.getPhone());
                if (StringUtils.isNull(c))
                {
                    BeanValidators.validateWithException(validator, item);
                    this.insertComContactsOut(item);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + item.getPhone() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    BeanValidators.validateWithException(validator, item);
                    item.setUpdateBy(operName);
                    this.updateComContactsOut(item);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + item.getPhone() + " 更新成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + item.getPhone() + " 已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + item.getPhone() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }


}
