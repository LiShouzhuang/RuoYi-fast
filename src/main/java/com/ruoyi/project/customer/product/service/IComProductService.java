package com.ruoyi.project.customer.product.service;

import java.util.List;
import com.ruoyi.project.customer.product.domain.ComProduct;
import com.ruoyi.project.customer.sea.domain.ComSea;

/**
 * 产品Service接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface IComProductService 
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
     * 批量删除产品
     * 
     * @param ids 需要删除的产品主键集合
     * @return 结果
     */
    public int deleteComProductByIds(String ids);

    /**
     * 删除产品信息
     * 
     * @param id 产品主键
     * @return 结果
     */
    public int deleteComProductById(Long id);

    /**
     * 导入数据
     */
    public String importProduct(List<ComProduct> comSeaList, Boolean isUpdateSupport);
}
