package com.ruoyi.project.customer.product.mapper;

import java.util.List;
import com.ruoyi.project.customer.product.domain.ComProduct;

/**
 * 产品Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface ComProductMapper 
{
    /**
     * 查询产品
     * 
     * @param id 产品主键
     * @return 产品
     */
    public ComProduct selectComProductById(Long id);

    /**
     * 查询产品列表
     * 
     * @param comProduct 产品
     * @return 产品集合
     */
    public List<ComProduct> selectComProductList(ComProduct comProduct);

    /**
     * 新增产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    public int insertComProduct(ComProduct comProduct);

    /**
     * 修改产品
     * 
     * @param comProduct 产品
     * @return 结果
     */
    public int updateComProduct(ComProduct comProduct);

    /**
     * 删除产品
     * 
     * @param id 产品主键
     * @return 结果
     */
    public int deleteComProductById(Long id);

    /**
     * 批量删除产品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComProductByIds(String[] ids);
}
