package com.ruoyi.project.customer.cusomer.mapper;

import java.util.List;
import com.ruoyi.project.customer.cusomer.domain.ComCustomer;

/**
 * 企业Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-12
 */
public interface ComCustomerMapper 
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
     * 删除企业
     * 
     * @param id 企业主键
     * @return 结果
     */
    public int deleteComCustomerById(Long id);

    /**
     * 批量删除企业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComCustomerByIds(String[] ids);
}
