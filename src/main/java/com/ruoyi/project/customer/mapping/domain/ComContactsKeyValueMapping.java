package com.ruoyi.project.customer.mapping.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 扩展关系表对象 com_contacts_key_value_mapping
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public class ComContactsKeyValueMapping extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 业务表名称 */
    @Excel(name = "业务表名称")
    private String tableName;

    /** 扩展字段外键 */
    @Excel(name = "扩展字段外键")
    private String mappingKey;

    /** 值,扩展字段中文名 */
    @Excel(name = "值,扩展字段中文名")
    private String mappingValue;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    public String getTableName()
    {
        return tableName;
    }
    public void setMappingKey(String mappingKey)
    {
        this.mappingKey = mappingKey;
    }

    public String getMappingKey()
    {
        return mappingKey;
    }
    public void setMappingValue(String mappingValue)
    {
        this.mappingValue = mappingValue;
    }

    public String getMappingValue()
    {
        return mappingValue;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tableName", getTableName())
            .append("mappingKey", getMappingKey())
            .append("mappingValue", getMappingValue())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
