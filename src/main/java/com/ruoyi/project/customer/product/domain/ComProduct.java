package com.ruoyi.project.customer.product.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 产品对象 com_product
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public class ComProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String productCode;

    /** 产品类别 */
    @Excel(name = "产品类别")
    private String productType;

    /** 名称 */
    @Excel(name = "名称")
    private String productName;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 产品单价 */
    @Excel(name = "产品单价")
    private Long price;

    /** 产品负责人id */
    @Excel(name = "产品负责人id")
    private String staffId;

    /** 产品负责人编码 */
    @Excel(name = "产品负责人编码")
    private String staffCode;

    /** 产品负责人名称 */
    @Excel(name = "产品负责人名称")
    private String staffName;

    /** 产品描述 */
    @Excel(name = "产品描述")
    private String description;

    /** 图片 */
    @Excel(name = "图片")
    private String contractPicture;

    /** 附件 */
    @Excel(name = "附件")
    private String contractAccessory;

    /** 拓展字段 */
    @Excel(name = "拓展字段")
    private String ext;

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
    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getProductCode()
    {
        return productCode;
    }
    public void setProductType(String productType)
    {
        this.productType = productType;
    }

    public String getProductType()
    {
        return productType;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setPrice(Long price)
    {
        this.price = price;
    }

    public Long getPrice()
    {
        return price;
    }
    public void setStaffId(String staffId)
    {
        this.staffId = staffId;
    }

    public String getStaffId()
    {
        return staffId;
    }
    public void setStaffCode(String staffCode)
    {
        this.staffCode = staffCode;
    }

    public String getStaffCode()
    {
        return staffCode;
    }
    public void setStaffName(String staffName)
    {
        this.staffName = staffName;
    }

    public String getStaffName()
    {
        return staffName;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setContractPicture(String contractPicture)
    {
        this.contractPicture = contractPicture;
    }

    public String getContractPicture()
    {
        return contractPicture;
    }
    public void setContractAccessory(String contractAccessory)
    {
        this.contractAccessory = contractAccessory;
    }

    public String getContractAccessory()
    {
        return contractAccessory;
    }
    public void setExt(String ext)
    {
        this.ext = ext;
    }

    public String getExt()
    {
        return ext;
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
            .append("productCode", getProductCode())
            .append("productType", getProductType())
            .append("productName", getProductName())
            .append("status", getStatus())
            .append("price", getPrice())
            .append("staffId", getStaffId())
            .append("staffCode", getStaffCode())
            .append("staffName", getStaffName())
            .append("description", getDescription())
            .append("contractPicture", getContractPicture())
            .append("contractAccessory", getContractAccessory())
            .append("ext", getExt())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
