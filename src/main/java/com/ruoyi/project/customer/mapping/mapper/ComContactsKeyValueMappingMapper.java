package com.ruoyi.project.customer.mapping.mapper;

import java.util.List;
import com.ruoyi.project.customer.mapping.domain.ComContactsKeyValueMapping;

/**
 * 扩展关系表Mapper接口
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public interface ComContactsKeyValueMappingMapper 
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
     * 删除扩展关系表
     * 
     * @param id 扩展关系表主键
     * @return 结果
     */
    public int deleteComContactsKeyValueMappingById(Long id);

    /**
     * 批量删除扩展关系表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComContactsKeyValueMappingByIds(String[] ids);
}
