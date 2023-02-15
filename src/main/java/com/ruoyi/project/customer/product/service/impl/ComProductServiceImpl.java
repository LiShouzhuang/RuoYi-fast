package com.ruoyi.project.customer.product.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.product.mapper.ComProductMapper;
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.product.service.IComProductService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 产品Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComProductServiceImpl implements IComProductService 
{
    @Autowired
    private ComProductMapper comProductMapper;

    /**
     * 查询产品
     * 
     * @param id 产品主键
     * @return 产品
     */
    @Override
    public ComProduct selectComProductById(Long id)
    {
        return comProductMapper.selectComProductById(id);
    }

    /**
     * 查询产品列表
     * 
     * @param comProduct 产品
     * @return 产品
     */
    @Override
    public List<ComProduct> selectComProductList(ComProduct comProduct)
    {
        return comProductMapper.selectComProductList(comProduct);
    }

    /**
     * 新增产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    @Override
    public int insertComProduct(ComProduct comProduct)
    {
        comProduct.setCreateTime(DateUtils.getNowDate());
        return comProductMapper.insertComProduct(comProduct);
    }

    /**
     * 修改产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    @Override
    public int updateComProduct(ComProduct comProduct)
    {
        comProduct.setUpdateTime(DateUtils.getNowDate());
        return comProductMapper.updateComProduct(comProduct);
    }

    /**
     * 批量删除产品
     * 
     * @param ids 需要删除的产品主键
     * @return 结果
     */
    @Override
    public int deleteComProductByIds(String ids)
    {
        return comProductMapper.deleteComProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品信息
     * 
     * @param id 产品主键
     * @return 结果
     */
    @Override
    public int deleteComProductById(Long id)
    {
        return comProductMapper.deleteComProductById(id);
    }
}
