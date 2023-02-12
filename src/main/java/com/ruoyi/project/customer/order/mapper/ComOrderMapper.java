package com.ruoyi.project.customer.order.mapper;

import java.util.List;
import com.ruoyi.project.customer.order.domain.ComOrder;

/**
 * 订单Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-12
 */
public interface ComOrderMapper 
{
    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    public ComOrder selectComOrderById(Long id);

    /**
     * 查询订单列表
     * 
     * @param comOrder 订单
     * @return 订单集合
     */
    public List<ComOrder> selectComOrderList(ComOrder comOrder);

    /**
     * 新增订单
     * 
     * @param comOrder 订单
     * @return 结果
     */
    public int insertComOrder(ComOrder comOrder);

    /**
     * 修改订单
     * 
     * @param comOrder 订单
     * @return 结果
     */
    public int updateComOrder(ComOrder comOrder);

    /**
     * 删除订单
     * 
     * @param id 订单主键
     * @return 结果
     */
    public int deleteComOrderById(Long id);

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComOrderByIds(String[] ids);
}
