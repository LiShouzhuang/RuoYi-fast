package com.ruoyi.project.customer.mapping.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.customer.mapping.mapper.ComContactsKeyValueMappingMapper;
import com.ruoyi.project.customer.mapping.domain.ComContactsKeyValueMapping;
import com.ruoyi.project.customer.mapping.service.IComContactsKeyValueMappingService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 扩展关系表Service业务层处理
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
@Service
public class ComContactsKeyValueMappingServiceImpl implements IComContactsKeyValueMappingService 
{
    @Autowired
    private ComContactsKeyValueMappingMapper comContactsKeyValueMappingMapper;

    /**
     * 查询扩展关系表
     * 
     * @param id 扩展关系表主键
     * @return 扩展关系表
     */
    @Override
    public ComContactsKeyValueMapping selectComContactsKeyValueMappingById(Long id)
    {
        return comContactsKeyValueMappingMapper.selectComContactsKeyValueMappingById(id);
    }

    /**
     * 查询扩展关系表列表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 扩展关系表
     */
    @Override
    public List<ComContactsKeyValueMapping> selectComContactsKeyValueMappingList(ComContactsKeyValueMapping comContactsKeyValueMapping)
    {
        return comContactsKeyValueMappingMapper.selectComContactsKeyValueMappingList(comContactsKeyValueMapping);
    }

    /**
     * 新增扩展关系表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 结果
     */
    @Override
    public int insertComContactsKeyValueMapping(ComContactsKeyValueMapping comContactsKeyValueMapping)
    {
        comContactsKeyValueMapping.setCreateTime(DateUtils.getNowDate());
        return comContactsKeyValueMappingMapper.insertComContactsKeyValueMapping(comContactsKeyValueMapping);
    }

    /**
     * 修改扩展关系表
     * 
     * @param comContactsKeyValueMapping 扩展关系表
     * @return 结果
     */
    @Override
    public int updateComContactsKeyValueMapping(ComContactsKeyValueMapping comContactsKeyValueMapping)
    {
        comContactsKeyValueMapping.setUpdateTime(DateUtils.getNowDate());
        return comContactsKeyValueMappingMapper.updateComContactsKeyValueMapping(comContactsKeyValueMapping);
    }

    /**
     * 批量删除扩展关系表
     * 
     * @param ids 需要删除的扩展关系表主键
     * @return 结果
     */
    @Override
    public int deleteComContactsKeyValueMappingByIds(String ids)
    {
        return comContactsKeyValueMappingMapper.deleteComContactsKeyValueMappingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除扩展关系表信息
     * 
     * @param id 扩展关系表主键
     * @return 结果
     */
    @Override
    public int deleteComContactsKeyValueMappingById(Long id)
    {
        return comContactsKeyValueMappingMapper.deleteComContactsKeyValueMappingById(id);
    }
}
