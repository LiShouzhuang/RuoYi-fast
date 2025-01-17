package com.ruoyi.project.customer.customer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户对象 com_customer
 * 
 * @author 李守壮
 * @date 2023-02-13
 */
public class ComCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户id */
    private Long id;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String companyCode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String companyName;

    /** 状态 */
    @Excel(name = "状态")
    private Integer companyStatus;

    /** 客户联系人名称 */
    @Excel(name = "客户联系人名称")
    private String companyUserName;

    /** 客户职务 */
    @Excel(name = "客户职务")
    private String companyTitle;

    /** 客户联系人电话 */
    @Excel(name = "客户联系人电话")
    private String mobile;

    /** 客户联系人手机 */
    @Excel(name = "客户联系人手机")
    private String telephone;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankName;

    /** 银行账户 */
    @Excel(name = "银行账户")
    private String bankNo;

    /** 账户 */
    @Excel(name = "账户")
    private String accountNo;

    /** 城市id */
    @Excel(name = "城市id")
    private Long cityId;

    /** 城市名称 */
    @Excel(name = "城市名称")
    private String cityName;

    /** 省份id */
    @Excel(name = "省份id")
    private Long provinceId;

    /** 省份名称 */
    @Excel(name = "省份名称")
    private String provinceName;

    /** 产业 */
    @Excel(name = "产业")
    private Long industry;

    /** 客服id */
    @Excel(name = "客服id")
    private Long kefuId;

    /** 客服姓名 */
    @Excel(name = "客服姓名")
    private String kefuName;

    /** 客服手机号码 */
    @Excel(name = "客服手机号码")
    private String kefuMobile;

    /** 联系邮箱 */
    @Excel(name = "联系邮箱")
    private String kefuEmail;

    /** 对接销售id */
    @Excel(name = "对接销售id")
    private Long salesId;

    /** 销售姓名 */
    @Excel(name = "销售姓名")
    private String salesName;

    /** 销售手机 */
    @Excel(name = "销售手机")
    private String salesMobile;

    /** 销售邮箱 */
    @Excel(name = "销售邮箱")
    private String salesEmail;

    /** 收件地址 */
    @Excel(name = "收件地址")
    private String receiveAddress;

    /** 收件城市id */
    @Excel(name = "收件城市id")
    private Long receiveCityId;

    /** 收件人名 */
    @Excel(name = "收件人名")
    private String receiveName;

    /** 收件省份id */
    @Excel(name = "收件省份id")
    private Long receiveProvinceId;

    /** 收件电话 */
    @Excel(name = "收件电话")
    private String receiveTelephone;

    /** 收件城市名 */
    @Excel(name = "收件城市名")
    private String receiveCityName;

    /** 收件身份名 */
    @Excel(name = "收件身份名")
    private String receiveProvinceName;

    /** 渠道id */
    @Excel(name = "渠道id")
    private Long channelId;

    /** 渠道code */
    @Excel(name = "渠道code")
    private String channelCode;

    /** 企业分类 */
    @Excel(name = "企业分类")
    private String classification;

    /** 注册地址 */
    @Excel(name = "注册地址")
    private String regAddress;

    /** 企业类型 */
    @Excel(name = "企业类型")
    private String enterpriseType;

    /** 注册资本 */
    @Excel(name = "注册资本")
    private String regCapital;

    /** 成立日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "成立日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date establishDate;

    /** 法人代表 */
    @Excel(name = "法人代表")
    private String legalRepresentative;

    /** 登记机关 */
    @Excel(name = "登记机关")
    private String regAuthority;

    /** 经营范围 */
    @Excel(name = "经营范围")
    private String businessScope;

    /** 行业类型 */
    @Excel(name = "行业类型")
    private String industryType;

    /** 关停企业日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "关停企业日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date closeDate;

    /** 关停原因 */
    @Excel(name = "关停原因")
    private String closeReason;

    /** 合同id */
    @Excel(name = "合同id")
    private String companyContractId;

    /** 客户合同号 */
    @Excel(name = "客户合同号")
    private String companyContractCode;

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

    /** 累计金流 */
    @Excel(name = "累计金流")
    private Long contractTotalAmount;

    /** 是否续签客户 */
    @Excel(name = "是否续签客户")
    private String contractIsContinue;

    /** 发票名称 */
    @Excel(name = "发票名称")
    private String invoiceName;

    /** 纳税人识别号 */
    @Excel(name = "纳税人识别号")
    private Long invoiceNo;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Integer isDeleted;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
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
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getTelephone()
    {
        return telephone;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    public String getBankName()
    {
        return bankName;
    }
    public void setBankNo(String bankNo)
    {
        this.bankNo = bankNo;
    }

    public String getBankNo()
    {
        return bankNo;
    }
    public void setAccountNo(String accountNo)
    {
        this.accountNo = accountNo;
    }

    public String getAccountNo()
    {
        return accountNo;
    }
    public void setCityId(Long cityId)
    {
        this.cityId = cityId;
    }

    public Long getCityId()
    {
        return cityId;
    }
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getCityName()
    {
        return cityName;
    }
    public void setProvinceId(Long provinceId)
    {
        this.provinceId = provinceId;
    }

    public Long getProvinceId()
    {
        return provinceId;
    }
    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public String getProvinceName()
    {
        return provinceName;
    }
    public void setIndustry(Long industry)
    {
        this.industry = industry;
    }

    public Long getIndustry()
    {
        return industry;
    }
    public void setKefuId(Long kefuId)
    {
        this.kefuId = kefuId;
    }

    public Long getKefuId()
    {
        return kefuId;
    }
    public void setKefuName(String kefuName)
    {
        this.kefuName = kefuName;
    }

    public String getKefuName()
    {
        return kefuName;
    }
    public void setKefuMobile(String kefuMobile)
    {
        this.kefuMobile = kefuMobile;
    }

    public String getKefuMobile()
    {
        return kefuMobile;
    }
    public void setKefuEmail(String kefuEmail)
    {
        this.kefuEmail = kefuEmail;
    }

    public String getKefuEmail()
    {
        return kefuEmail;
    }
    public void setSalesId(Long salesId)
    {
        this.salesId = salesId;
    }

    public Long getSalesId()
    {
        return salesId;
    }
    public void setSalesName(String salesName)
    {
        this.salesName = salesName;
    }

    public String getSalesName()
    {
        return salesName;
    }
    public void setSalesMobile(String salesMobile)
    {
        this.salesMobile = salesMobile;
    }

    public String getSalesMobile()
    {
        return salesMobile;
    }
    public void setSalesEmail(String salesEmail)
    {
        this.salesEmail = salesEmail;
    }

    public String getSalesEmail()
    {
        return salesEmail;
    }
    public void setReceiveAddress(String receiveAddress)
    {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveAddress()
    {
        return receiveAddress;
    }
    public void setReceiveCityId(Long receiveCityId)
    {
        this.receiveCityId = receiveCityId;
    }

    public Long getReceiveCityId()
    {
        return receiveCityId;
    }
    public void setReceiveName(String receiveName)
    {
        this.receiveName = receiveName;
    }

    public String getReceiveName()
    {
        return receiveName;
    }
    public void setReceiveProvinceId(Long receiveProvinceId)
    {
        this.receiveProvinceId = receiveProvinceId;
    }

    public Long getReceiveProvinceId()
    {
        return receiveProvinceId;
    }
    public void setReceiveTelephone(String receiveTelephone)
    {
        this.receiveTelephone = receiveTelephone;
    }

    public String getReceiveTelephone()
    {
        return receiveTelephone;
    }
    public void setReceiveCityName(String receiveCityName)
    {
        this.receiveCityName = receiveCityName;
    }

    public String getReceiveCityName()
    {
        return receiveCityName;
    }
    public void setReceiveProvinceName(String receiveProvinceName)
    {
        this.receiveProvinceName = receiveProvinceName;
    }

    public String getReceiveProvinceName()
    {
        return receiveProvinceName;
    }
    public void setChannelId(Long channelId)
    {
        this.channelId = channelId;
    }

    public Long getChannelId()
    {
        return channelId;
    }
    public void setChannelCode(String channelCode)
    {
        this.channelCode = channelCode;
    }

    public String getChannelCode()
    {
        return channelCode;
    }
    public void setClassification(String classification)
    {
        this.classification = classification;
    }

    public String getClassification()
    {
        return classification;
    }
    public void setRegAddress(String regAddress)
    {
        this.regAddress = regAddress;
    }

    public String getRegAddress()
    {
        return regAddress;
    }
    public void setEnterpriseType(String enterpriseType)
    {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseType()
    {
        return enterpriseType;
    }
    public void setRegCapital(String regCapital)
    {
        this.regCapital = regCapital;
    }

    public String getRegCapital()
    {
        return regCapital;
    }
    public void setEstablishDate(Date establishDate)
    {
        this.establishDate = establishDate;
    }

    public Date getEstablishDate()
    {
        return establishDate;
    }
    public void setLegalRepresentative(String legalRepresentative)
    {
        this.legalRepresentative = legalRepresentative;
    }

    public String getLegalRepresentative()
    {
        return legalRepresentative;
    }
    public void setRegAuthority(String regAuthority)
    {
        this.regAuthority = regAuthority;
    }

    public String getRegAuthority()
    {
        return regAuthority;
    }
    public void setBusinessScope(String businessScope)
    {
        this.businessScope = businessScope;
    }

    public String getBusinessScope()
    {
        return businessScope;
    }
    public void setIndustryType(String industryType)
    {
        this.industryType = industryType;
    }

    public String getIndustryType()
    {
        return industryType;
    }
    public void setCloseDate(Date closeDate)
    {
        this.closeDate = closeDate;
    }

    public Date getCloseDate()
    {
        return closeDate;
    }
    public void setCloseReason(String closeReason)
    {
        this.closeReason = closeReason;
    }

    public String getCloseReason()
    {
        return closeReason;
    }
    public void setCompanyContractId(String companyContractId)
    {
        this.companyContractId = companyContractId;
    }

    public String getCompanyContractId()
    {
        return companyContractId;
    }
    public void setCompanyContractCode(String companyContractCode)
    {
        this.companyContractCode = companyContractCode;
    }

    public String getCompanyContractCode()
    {
        return companyContractCode;
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
    public void setContractTotalAmount(Long contractTotalAmount)
    {
        this.contractTotalAmount = contractTotalAmount;
    }

    public Long getContractTotalAmount()
    {
        return contractTotalAmount;
    }
    public void setContractIsContinue(String contractIsContinue)
    {
        this.contractIsContinue = contractIsContinue;
    }

    public String getContractIsContinue()
    {
        return contractIsContinue;
    }
    public void setInvoiceName(String invoiceName)
    {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName()
    {
        return invoiceName;
    }
    public void setInvoiceNo(Long invoiceNo)
    {
        this.invoiceNo = invoiceNo;
    }

    public Long getInvoiceNo()
    {
        return invoiceNo;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public Date getCreateDate()
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }
    public void setIsDeleted(Integer isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDeleted()
    {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyCode", getCompanyCode())
            .append("companyName", getCompanyName())
            .append("companyStatus", getCompanyStatus())
            .append("companyUserName", getCompanyUserName())
            .append("companyTitle", getCompanyTitle())
            .append("mobile", getMobile())
            .append("telephone", getTelephone())
            .append("address", getAddress())
            .append("bankName", getBankName())
            .append("bankNo", getBankNo())
            .append("accountNo", getAccountNo())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .append("industry", getIndustry())
            .append("kefuId", getKefuId())
            .append("kefuName", getKefuName())
            .append("kefuMobile", getKefuMobile())
            .append("kefuEmail", getKefuEmail())
            .append("salesId", getSalesId())
            .append("salesName", getSalesName())
            .append("salesMobile", getSalesMobile())
            .append("salesEmail", getSalesEmail())
            .append("receiveAddress", getReceiveAddress())
            .append("receiveCityId", getReceiveCityId())
            .append("receiveName", getReceiveName())
            .append("receiveProvinceId", getReceiveProvinceId())
            .append("receiveTelephone", getReceiveTelephone())
            .append("receiveCityName", getReceiveCityName())
            .append("receiveProvinceName", getReceiveProvinceName())
            .append("remark", getRemark())
            .append("channelId", getChannelId())
            .append("channelCode", getChannelCode())
            .append("classification", getClassification())
            .append("regAddress", getRegAddress())
            .append("enterpriseType", getEnterpriseType())
            .append("regCapital", getRegCapital())
            .append("establishDate", getEstablishDate())
            .append("legalRepresentative", getLegalRepresentative())
            .append("regAuthority", getRegAuthority())
            .append("businessScope", getBusinessScope())
            .append("industryType", getIndustryType())
            .append("closeDate", getCloseDate())
            .append("closeReason", getCloseReason())
            .append("companyContractId", getCompanyContractId())
            .append("companyContractCode", getCompanyContractCode())
            .append("contractStartDate", getContractStartDate())
            .append("contractEndDate", getContractEndDate())
            .append("contractAmount", getContractAmount())
            .append("contractTotalAmount", getContractTotalAmount())
            .append("contractIsContinue", getContractIsContinue())
            .append("invoiceName", getInvoiceName())
            .append("invoiceNo", getInvoiceNo())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("updateDate", getUpdateDate())
            .append("updateBy", getUpdateBy())
            .append("isDeleted", getIsDeleted())
            .toString();
    }
}
