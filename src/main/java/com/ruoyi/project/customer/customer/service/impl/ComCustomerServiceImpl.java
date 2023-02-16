package com.ruoyi.project.customer.customer.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.system.config.service.IConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.customer.mapper.ComCustomerMapper;
import com.ruoyi.project.customer.customer.domain.ComCustomer;
import com.ruoyi.project.customer.customer.service.IComCustomerService;
import com.ruoyi.common.utils.text.Convert;

import javax.validation.Validator;

/**
 * 客户Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Service
public class ComCustomerServiceImpl implements IComCustomerService 
{

    private static final Logger log = LoggerFactory.getLogger(ComCustomerServiceImpl.class);

    @Autowired
    private IConfigService configService;

    @Autowired
    protected Validator validator;

    @Autowired
    private ComCustomerMapper comCustomerMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public ComCustomer selectComCustomerById(Long id)
    {
        return comCustomerMapper.selectComCustomerById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param comCustomer 客户
     * @return 客户
     */
    @Override
    public List<ComCustomer> selectComCustomerList(ComCustomer comCustomer)
    {
        return comCustomerMapper.selectComCustomerList(comCustomer);
    }

    /**
     * 新增客户
     * 
     * @param comCustomer 客户
     * @return 结果
     */
    @Override
    public int insertComCustomer(ComCustomer comCustomer)
    {
        return comCustomerMapper.insertComCustomer(comCustomer);
    }

    /**
     * 修改客户
     * 
     * @param comCustomer 客户
     * @return 结果
     */
    @Override
    public int updateComCustomer(ComCustomer comCustomer)
    {
        return comCustomerMapper.updateComCustomer(comCustomer);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteComCustomerByIds(String ids)
    {
        return comCustomerMapper.deleteComCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteComCustomerById(Long id)
    {
        return comCustomerMapper.deleteComCustomerById(id);
    }





    /**
     * 导入用户数据
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     */
    @Override
    public String importCustomer(List<ComCustomer> customerList, Boolean isUpdateSupport)
    {
        if (StringUtils.isNull(customerList) || customerList.size() == 0)
        {
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        String operName = ShiroUtils.getLoginName();
        String password = configService.selectConfigByKey("sys.user.initPassword");
        for (ComCustomer customer : customerList)
        {
            try
            {
                // 验证是否存在这个客户
                ComCustomer c= comCustomerMapper.selectCustomerByCompanyName(customer.getCompanyName());
                if (StringUtils.isNull(c))
                {
                    BeanValidators.validateWithException(validator, customer);
                    this.insertComCustomer(customer);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + customer.getCompanyName() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    BeanValidators.validateWithException(validator, customer);
                    customer.setUpdateBy(operName);
                    this.updateComCustomer(customer);
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
