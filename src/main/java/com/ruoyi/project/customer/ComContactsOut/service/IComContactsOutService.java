package com.ruoyi.project.customer.ComContactsOut.service;

import java.util.List;
import com.ruoyi.project.customer.ComContactsOut.domain.ComContactsOut;
import com.ruoyi.project.customer.product.domain.ComProduct;

/**
 * 外部通讯录Service接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface IComContactsOutService 
{
    /**
     * 查询外部通讯录
     * 
     * @param id 外部通讯录主键
     * @return 外部通讯录
     */
    public ComContactsOut selectComContactsOutById(Long id);

    /**
     * 查询外部通讯录列表
     * 
     * @param comContactsOut 外部通讯录
     * @return 外部通讯录集合
     */
    public List<ComContactsOut> selectComContactsOutList(ComContactsOut comContactsOut);

    /**
     * 新增外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    public int insertComContactsOut(ComContactsOut comContactsOut);

    /**
     * 修改外部通讯录
     * 
     * @param comContactsOut 外部通讯录
     * @return 结果
     */
    public int updateComContactsOut(ComContactsOut comContactsOut);

    /**
     * 批量删除外部通讯录
     * 
     * @param ids 需要删除的外部通讯录主键集合
     * @return 结果
     */
    public int deleteComContactsOutByIds(String ids);

    /**
     * 删除外部通讯录信息
     * 
     * @param id 外部通讯录主键
     * @return 结果
     */
    public int deleteComContactsOutById(Long id);

    /**
     * 导入数据
     */
    public String importContactsOut(List<ComContactsOut> comContactsOutList, Boolean isUpdateSupport);


    /**
     * 查询外部通讯录
     *
     * @param phone 外部通讯录主键
     * @return 外部通讯录
     */
    public ComContactsOut selectComContactsOutByPhone(String phone);
}
