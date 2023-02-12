package com.ruoyi.project.customer.cusomer.service;

import com.ruoyi.project.customer.cusomer.domain.ComCustomer;

import java.util.List;


/**
 * 企业Service接口
 * 
 * @author ruoyi
 * @date 2023-02-12
 */
public interface IComCustomerService 
{
    /**
     * 查询企业
     * 
     * @param id 企业主键
     * @return 企业
     */
    public ComCustomer selectComCustomerById(Long id);

    /**
     * 查询企业列表
     * 
     * @param comCustomer 企业
     * @return 企业集合
     */
    public List<ComCustomer> selectComCustomerList(ComCustomer comCustomer);

    /**
     * 新增企业
     * 
     * @param comCustomer 企业
     * @return 结果
     */
    public int insertComCustomer(ComCustomer comCustomer);

    /**
     * 修改企业
     * 
     * @param comCustomer 企业
     * @return 结果
     */
    public int updateComCustomer(ComCustomer comCustomer);

    /**
     * 批量删除企业
     * 
     * @param ids 需要删除的企业主键集合
     * @return 结果
     */
    public int deleteComCustomerByIds(String ids);

    /**
     * 删除企业信息
     * 
     * @param id 企业主键
     * @return 结果
     */
    public int deleteComCustomerById(Long id);
}
