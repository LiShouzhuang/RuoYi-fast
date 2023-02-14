package com.ruoyi.project.customer.order.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.order.mapper.ComOrderMapper;
import com.ruoyi.project.customer.order.domain.ComOrder;
import com.ruoyi.project.customer.order.service.IComOrderService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 订单Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
@Service
public class ComOrderServiceImpl implements IComOrderService 
{
    @Autowired
    private ComOrderMapper comOrderMapper;

    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    @Override
    public ComOrder selectComOrderById(Long id)
    {
        return comOrderMapper.selectComOrderById(id);
    }

    /**
     * 查询订单列表
     * 
     * @param comOrder 订单
     * @return 订单
     */
    @Override
    public List<ComOrder> selectComOrderList(ComOrder comOrder)
    {
        return comOrderMapper.selectComOrderList(comOrder);
    }

    /**
     * 新增订单
     * 
     * @param comOrder 订单
     * @return 结果
     */
    @Override
    public int insertComOrder(ComOrder comOrder)
    {
        return comOrderMapper.insertComOrder(comOrder);
    }

    /**
     * 修改订单
     * 
     * @param comOrder 订单
     * @return 结果
     */
    @Override
    public int updateComOrder(ComOrder comOrder)
    {
        return comOrderMapper.updateComOrder(comOrder);
    }

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteComOrderByIds(String ids)
    {
        return comOrderMapper.deleteComOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单信息
     * 
     * @param id 订单主键
     * @return 结果
     */
    @Override
    public int deleteComOrderById(Long id)
    {
        return comOrderMapper.deleteComOrderById(id);
    }
}
