package com.ruoyi.project.customer.order.service;

import java.util.List;
import com.ruoyi.project.customer.order.domain.ComOrder;

/**
 * 订单Service接口
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
public interface IComOrderService 
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
     * 批量删除订单
     * 
     * @param ids 需要删除的订单主键集合
     * @return 结果
     */
    public int deleteComOrderByIds(String ids);

    /**
     * 删除订单信息
     * 
     * @param id 订单主键
     * @return 结果
     */
    public int deleteComOrderById(Long id);
}
