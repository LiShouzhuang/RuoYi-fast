package com.ruoyi.project.customer.sea.mapper;

import java.util.List;

import com.ruoyi.project.customer.customer.domain.ComCustomer;
import com.ruoyi.project.customer.sea.domain.ComSea;

/**
 * 客户公海Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
public interface ComSeaMapper 
{
    /**
     * 查询客户公海
     * 
     * @param id 客户公海主键
     * @return 客户公海
     */
    public ComSea selectComSeaById(Long id);

    /**
     * 查询客户公海列表
     * 
     * @param comSea 客户公海
     * @return 客户公海集合
     */
    public List<ComSea> selectComSeaList(ComSea comSea);

    /**
     * 新增客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    public int insertComSea(ComSea comSea);

    /**
     * 修改客户公海
     * 
     * @param comSea 客户公海
     * @return 结果
     */
    public int updateComSea(ComSea comSea);

    /**
     * 删除客户公海
     * 
     * @param id 客户公海主键
     * @return 结果
     */
    public int deleteComSeaById(Long id);

    /**
     * 批量删除客户公海
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComSeaByIds(String[] ids);


    public ComCustomer selectCustomerByPhone(String phone);
}
