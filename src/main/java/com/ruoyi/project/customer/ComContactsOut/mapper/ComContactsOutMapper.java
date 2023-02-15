package com.ruoyi.project.customer.ComContactsOut.mapper;

import java.util.List;
import com.ruoyi.project.customer.ComContactsOut.domain.ComContactsOut;
import com.ruoyi.project.customer.product.domain.ComProduct;

/**
 * 外部通讯录Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface ComContactsOutMapper 
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
     * 删除外部通讯录
     * 
     * @param id 外部通讯录主键
     * @return 结果
     */
    public int deleteComContactsOutById(Long id);

    /**
     * 批量删除外部通讯录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComContactsOutByIds(String[] ids);


    public ComContactsOut selectComContactsOutByPhone(String phone);
}
