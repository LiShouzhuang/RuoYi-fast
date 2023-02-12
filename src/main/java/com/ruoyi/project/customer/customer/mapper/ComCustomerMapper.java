package com.ruoyi.project.customer.customer.mapper;

import java.util.List;

import com.ruoyi.project.customer.customer.domain.ComCustomer;

/**
 * 客户基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-12
 */
public interface ComCustomerMapper 
{
    /**
     * 查询客户基本信息
     * 
     * @param id 客户基本信息主键
     * @return 客户基本信息
     */
    public ComCustomer selectComCustomerById(Long id);

    /**
     * 查询客户基本信息列表
     * 
     * @param comCustomer 客户基本信息
     * @return 客户基本信息集合
     */
    public List<ComCustomer> selectComCustomerList(ComCustomer comCustomer);

    /**
     * 新增客户基本信息
     * 
     * @param comCustomer 客户基本信息
     * @return 结果
     */
    public int insertComCustomer(ComCustomer comCustomer);

    /**
     * 修改客户基本信息
     * 
     * @param comCustomer 客户基本信息
     * @return 结果
     */
    public int updateComCustomer(ComCustomer comCustomer);

    /**
     * 删除客户基本信息
     * 
     * @param id 客户基本信息主键
     * @return 结果
     */
    public int deleteComCustomerById(Long id);

    /**
     * 批量删除客户基本信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComCustomerByIds(String[] ids);
}
