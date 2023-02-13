package com.ruoyi.project.customer.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.customer.mapper.ComCustomerMapper;
import com.ruoyi.project.customer.customer.domain.ComCustomer;
import com.ruoyi.project.customer.customer.service.IComCustomerService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
@Service
public class ComCustomerServiceImpl implements IComCustomerService 
{
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
}
