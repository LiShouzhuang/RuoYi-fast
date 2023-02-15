package com.ruoyi.project.customer.mapping.service;

import java.util.List;
import com.ruoyi.project.customer.mapping.domain.ComContactsKeyValueMapping;

/**
 * 扩展关系表Service接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface IComContactsKeyValueMappingService 
{
    /**
     * 查询扩展关系表
     * 
     * @param id 扩展关系表主键
     * @return 扩展关系表
     */
    public ComContactsKeyValueMapping selectComContactsKeyValueMappingById(Long id);

    /**
     * 查询扩展关系表列表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 扩展关系表集合
     */
    public List<ComContactsKeyValueMapping> selectComContactsKeyValueMappingList(ComContactsKeyValueMapping comContactsKeyValueMapping);

    /**
     * 新增扩展关系表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 结果
     */
    public int insertComContactsKeyValueMapping(ComContactsKeyValueMapping comContactsKeyValueMapping);

    /**
     * 修改扩展关系表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 结果
     */
    public int updateComContactsKeyValueMapping(ComContactsKeyValueMapping comContactsKeyValueMapping);

    /**
     * 批量删除扩展关系表
     * 
     * @param ids 需要删除的扩展关系表主键集合
     * @return 结果
     */
    public int deleteComContactsKeyValueMappingByIds(String ids);

    /**
     * 删除扩展关系表信息
     * 
     * @param id 扩展关系表主键
     * @return 结果
     */
    public int deleteComContactsKeyValueMappingById(Long id);



    /**
     * 查询扩展关系表
     *
     * @param tableName 扩展关系表主键
     * @return 扩展关系表
     */
    public ComContactsKeyValueMapping selectComContactsKeyValueMappingByTableName(String tableName);
}
