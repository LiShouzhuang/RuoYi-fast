package com.ruoyi.project.customer.sea.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.customer.customer.domain.ComCustomer;
import com.ruoyi.project.system.config.service.IConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.sea.mapper.ComSeaMapper;
import com.ruoyi.project.customer.sea.domain.ComSea;
import com.ruoyi.project.customer.sea.service.IComSeaService;
import com.ruoyi.common.utils.text.Convert;

import javax.validation.Validator;

/**
 * 客户公海Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
@Service
public class ComSeaServiceImpl implements IComSeaService 
{

    private static final Logger log = LoggerFactory.getLogger(ComSeaServiceImpl.class);

    @Autowired
    private IConfigService configService;

    @Autowired
    protected Validator validator;

    @Autowired
    private ComSeaMapper comSeaMapper;

    /**
     * 查询客户公海
     * 
     * @param id 客户公海主键
     * @return 客户公海
     */
    @Override
    public ComSea selectComSeaById(Long id)
    {
        return comSeaMapper.selectComSeaById(id);
    }

    /**
     * 查询客户公海列表
     * 
     * @param comSea 客户公海
     * @return 客户公海
     */
    @Override
    public List<ComSea> selectComSeaList(ComSea comSea)
    {
        return comSeaMapper.selectComSeaList(comSea);
    }

    /**
     * 新增客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    @Override
    public int insertComSea(ComSea comSea)
    {
        comSea.setCreateTime(DateUtils.getNowDate());
        return comSeaMapper.insertComSea(comSea);
    }

    /**
     * 修改客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    @Override
    public int updateComSea(ComSea comSea)
    {
        comSea.setUpdateTime(DateUtils.getNowDate());
        return comSeaMapper.updateComSea(comSea);
    }

    /**
     * 批量删除客户公海
     * 
     * @param ids 需要删除的客户公海主键
     * @return 结果
     */
    @Override
    public int deleteComSeaByIds(String ids)
    {
        return comSeaMapper.deleteComSeaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户公海信息
     * 
     * @param id 客户公海主键
     * @return 结果
     */
    @Override
    public int deleteComSeaById(Long id)
    {
        return comSeaMapper.deleteComSeaById(id);
    }




    /**
     * 导入用户数据
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     */
    @Override
    public String importSea(List<ComSea> customerList, Boolean isUpdateSupport)
    {
        if (StringUtils.isNull(customerList) || customerList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        String operName = ShiroUtils.getLoginName();
        String password = configService.selectConfigByKey("sys.user.initPassword");
        for (ComSea customer : customerList)
        {
            try
            {
                // 验证是否存在这个客户
                ComCustomer c= comSeaMapper.selectCustomerByPhone(customer.getPhone());
                if (StringUtils.isNull(c))
                {
                    BeanValidators.validateWithException(validator, customer);
                    this.insertComSea(customer);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + customer.getCompanyName() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    BeanValidators.validateWithException(validator, customer);
                    customer.setUpdateBy(operName);
                    this.updateComSea(customer);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + customer.getCompanyName() + " 更新成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + customer.getCompanyName() + " 已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + customer.getCompanyName() + " 导入失败：";
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
