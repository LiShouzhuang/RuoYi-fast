package com.ruoyi.project.customer.customer.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户基本信息对象 com_customer
 * 
 * @author ruoyi
 * @date 2023-02-12
 */
public class ComCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业id */
    private Long id;

    /** 企业编码 */
    @Excel(name = "企业编码")
    private String companyCode;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String companyName;

    /** 状态 1 正常 2 停用 */
    @Excel(name = "状态 1 正常 2 停用")
    private Integer companyStatus;

    /** 客户联系人号码 */
    @Excel(name = "客户联系人号码")
    private String mobile;

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

    /** 服务费率 */
    @Excel(name = "服务费率")
    private BigDecimal serviceRate;

    /** 对接销售id（来自大管家） */
    @Excel(name = "对接销售id", readConverterExp = "来=自大管家")
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

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    /** 公司电话 */
    @Excel(name = "公司电话")
    private String telephone;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankName;

    /** 银行账户 */
    @Excel(name = "银行账户")
    private String bankNo;

    /** 账户 */
    @Excel(name = "账户")
    private String accountNo;

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

    /** 组织机构代码 */
    @Excel(name = "组织机构代码")
    private String orgCode;

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
    private Date establisDate;

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
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getMobile()
    {
        return mobile;
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
    public void setServiceRate(BigDecimal serviceRate)
    {
        this.serviceRate = serviceRate;
    }

    public BigDecimal getServiceRate()
    {
        return serviceRate;
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
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getTelephone()
    {
        return telephone;
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
    public void setOrgCode(String orgCode)
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode()
    {
        return orgCode;
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
    public void setEstablisDate(Date establisDate)
    {
        this.establisDate = establisDate;
    }

    public Date getEstablisDate()
    {
        return establisDate;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyCode", getCompanyCode())
            .append("companyName", getCompanyName())
            .append("companyStatus", getCompanyStatus())
            .append("mobile", getMobile())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("updateDate", getUpdateDate())
            .append("updateBy", getUpdateBy())
            .append("isDeleted", getIsDeleted())
            .append("kefuId", getKefuId())
            .append("kefuName", getKefuName())
            .append("kefuMobile", getKefuMobile())
            .append("kefuEmail", getKefuEmail())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .append("industry", getIndustry())
            .append("serviceRate", getServiceRate())
            .append("salesId", getSalesId())
            .append("salesName", getSalesName())
            .append("salesMobile", getSalesMobile())
            .append("salesEmail", getSalesEmail())
            .append("address", getAddress())
            .append("telephone", getTelephone())
            .append("bankName", getBankName())
            .append("bankNo", getBankNo())
            .append("accountNo", getAccountNo())
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
            .append("orgCode", getOrgCode())
            .append("regAddress", getRegAddress())
            .append("enterpriseType", getEnterpriseType())
            .append("regCapital", getRegCapital())
            .append("establisDate", getEstablisDate())
            .append("legalRepresentative", getLegalRepresentative())
            .append("regAuthority", getRegAuthority())
            .append("businessScope", getBusinessScope())
            .append("industryType", getIndustryType())
            .append("closeDate", getCloseDate())
            .append("closeReason", getCloseReason())
            .toString();
    }
}
