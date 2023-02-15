package com.ruoyi.project.customer.contract.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 合同对象 com_contract
 * 
 * @author 李守壮
 * @date 2023-02-15
 */
public class ComContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractCode;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String contractName;

    /** 合同开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractStartDate;

    /** 合同结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractEndDate;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private Long contractAmount;

    /** 客户id */
    @Excel(name = "客户id")
    private String companyId;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String companyCode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String companyName;

    /** 状态,1新增 2续签 3已过期 */
    @Excel(name = "状态,1新增 2续签 3已过期")
    private Integer companyStatus;

    /** 联系人名称 */
    @Excel(name = "联系人名称")
    private String companyUserName;

    /** 联系人职务 */
    @Excel(name = "联系人职务")
    private String companyTitle;

    /** 联系人手机 */
    @Excel(name = "联系人手机")
    private String mobile;

    /** 合同状态（0正常 1停用） */
    @Excel(name = "合同状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 合同审核状态（0待审核 1审核中 2未通过 3审核通过） */
    @Excel(name = "合同审核状态", readConverterExp = "0=待审核,1=审核中,2=未通过,3=审核通过")
    private String contractStatus;

    /** 合同图片 */
    @Excel(name = "合同图片")
    private String contractPicture;

    /** 合同附件 */
    @Excel(name = "合同附件")
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
    public void setContractCode(String contractCode)
    {
        this.contractCode = contractCode;
    }

    public String getContractCode()
    {
        return contractCode;
    }
    public void setContractName(String contractName)
    {
        this.contractName = contractName;
    }

    public String getContractName()
    {
        return contractName;
    }
    public void setContractStartDate(Date contractStartDate)
    {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractStartDate()
    {
        return contractStartDate;
    }
    public void setContractEndDate(Date contractEndDate)
    {
        this.contractEndDate = contractEndDate;
    }

    public Date getContractEndDate()
    {
        return contractEndDate;
    }
    public void setContractAmount(Long contractAmount)
    {
        this.contractAmount = contractAmount;
    }

    public Long getContractAmount()
    {
        return contractAmount;
    }
    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }

    public String getCompanyId()
    {
        return companyId;
    }
    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode()
    {
        return companyCode;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyName()
    {
        return companyName;
    }
    public void setCompanyStatus(Integer companyStatus)
    {
        this.companyStatus = companyStatus;
    }

    public Integer getCompanyStatus()
    {
        return companyStatus;
    }
    public void setCompanyUserName(String companyUserName)
    {
        this.companyUserName = companyUserName;
    }

    public String getCompanyUserName()
    {
        return companyUserName;
    }
    public void setCompanyTitle(String companyTitle)
    {
        this.companyTitle = companyTitle;
    }

    public String getCompanyTitle()
    {
        return companyTitle;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getMobile()
    {
        return mobile;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setContractStatus(String contractStatus)
    {
        this.contractStatus = contractStatus;
    }

    public String getContractStatus()
    {
        return contractStatus;
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
            .append("contractCode", getContractCode())
            .append("contractName", getContractName())
            .append("contractStartDate", getContractStartDate())
            .append("contractEndDate", getContractEndDate())
            .append("contractAmount", getContractAmount())
            .append("companyId", getCompanyId())
            .append("companyCode", getCompanyCode())
            .append("companyName", getCompanyName())
            .append("companyStatus", getCompanyStatus())
            .append("companyUserName", getCompanyUserName())
            .append("companyTitle", getCompanyTitle())
            .append("mobile", getMobile())
            .append("status", getStatus())
            .append("contractStatus", getContractStatus())
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
