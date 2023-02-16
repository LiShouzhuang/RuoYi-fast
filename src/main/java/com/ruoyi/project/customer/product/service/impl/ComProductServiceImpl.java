package com.ruoyi.project.customer.product.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.product.mapper.ComProductMapper;
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.product.service.IComProductService;
import com.ruoyi.common.utils.text.Convert;

import com.ruoyi.project.system.config.service.IConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Validator;

/**
 * 产品Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComProductServiceImpl implements IComProductService 
{


    private static final Logger log = LoggerFactory.getLogger(ComProductServiceImpl.class);

    @Autowired
    private IConfigService configService;

    @Autowired
    protected Validator validator;

    @Autowired
    private ComProductMapper comProductMapper;

    /**
     * 查询产品
     * 
     * @param id 产品主键
     * @return 产品
     */
    @Override
    public ComProduct selectComProductById(Long id)
    {
        return comProductMapper.selectComProductById(id);
    }

    /**
     * 查询产品列表
     * 
     * @param comProduct 产品
     * @return 产品
     */
    @Override
    public List<ComProduct> selectComProductList(ComProduct comProduct)
    {
        return comProductMapper.selectComProductList(comProduct);
    }

    /**
     * 新增产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    @Override
    public int insertComProduct(ComProduct comProduct)
    {
        comProduct.setCreateTime(DateUtils.getNowDate());
        return comProductMapper.insertComProduct(comProduct);
    }

    /**
     * 修改产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    @Override
    public int updateComProduct(ComProduct comProduct)
    {
        comProduct.setUpdateTime(DateUtils.getNowDate());
        return comProductMapper.updateComProduct(comProduct);
    }

    /**
     * 批量删除产品
     * 
     * @param ids 需要删除的产品主键
     * @return 结果
     */
    @Override
    public int deleteComProductByIds(String ids)
    {
        return comProductMapper.deleteComProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品信息
     * 
     * @param id 产品主键
     * @return 结果
     */
    @Override
    public int deleteComProductById(Long id)
    {
        return comProductMapper.deleteComProductById(id);
    }





    /**
     * 导入用户数据
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     */
    @Override
    public String importProduct(List<ComProduct> list, Boolean isUpdateSupport)
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
        for (ComProduct item : list)
        {
            try
            {
                // 验证是否存在这个客户
                ComProduct c= comProductMapper.selectComProductByProductCode(item.getProductCode());
                if (StringUtils.isNull(c))
                {
                    BeanValidators.validateWithException(validator, item);
                    this.insertComProduct(item);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + item.getProductName() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    BeanValidators.validateWithException(validator, item);
                    item.setUpdateBy(operName);
                    this.updateComProduct(item);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + item.getProductName() + " 更新成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + item.getProductName() + " 已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + item.getProductName() + " 导入失败：";
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
