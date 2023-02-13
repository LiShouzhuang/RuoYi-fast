package com.ruoyi.project.customer.customer.mapper;

import java.util.List;
import com.ruoyi.project.customer.customer.domain.ComCustomer;

/**
 * 客户Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
public interface ComCustomerMapper 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public ComCustomer selectComCustomerById(Long id);

    /**
     * 查询客户列表
     * 
     * @param comCustomer 客户
     * @return 客户集合
     */
    public List<ComCustomer> selectComCustomerList(ComCustomer comCustomer);

    /**
     * 新增客户
     * 
     * @param comCustomer 客户
     * @return 结果
     */
    public int insertComCustomer(ComCustomer comCustomer);

    /**
     * 修改客户
     * 
     * @param comCustomer 客户
     * @return 结果
     */
    public int updateComCustomer(ComCustomer comCustomer);

    /**
     * 删除客户
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteComCustomerById(Long id);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComCustomerByIds(String[] ids);
}
