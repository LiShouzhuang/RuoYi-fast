package com.ruoyi.project.customer.sea.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户公海对象 com_sea
 *
 * @author 李守壮
 * @date 2023-02-14
 */
public class ComSea extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 客户代码 */
    @Excel(name = "客户代码")
    private String companyCode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String companyName;

    /** 联系人 */
    @Excel(name = "联系人")
    private String userName;

    /** 手机 */
    @Excel(name = "手机")
    private String phone;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String email;

    /** 用户性别（0男 1女 2未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 客户级别，1一般 2重要客户 3特别重要 */
    @Excel(name = "客户级别，1一般 2重要客户 3特别重要")
    private String level;

    /** 来源，1网站采集 2预约上门 3广告 4搜索引擎 5促销活动 */
    @Excel(name = "来源，1网站采集 2预约上门 3广告 4搜索引擎 5促销活动")
    private String source;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 帐号状态（0正常 1停用） */
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 跟进状态（0待沟通 1有意向 2初次沟通 3二次跟进 4已成交 5合同） */
    @Excel(name = "跟进状态", readConverterExp = "0=待沟通,1=有意向,2=初次沟通,3=二次跟进,4=已成交,5=合同")
    private String followStatus;

    /** 纳税人识别号 */
    @Excel(name = "纳税人识别号")
    private Long invoiceNo;

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

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 岗位ID */
    @Excel(name = "岗位ID")
    private Long postId;

    /** 岗位编码 */
    @Excel(name = "岗位编码")
    private String postCode;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String postName;

    /** 登录账号 */
    @Excel(name = "登录账号")
    private String loginName;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 联系人岗位 */
    @Excel(name = "联系人岗位")
    private String userDept;

    /** 联系人职务 */
    @Excel(name = "联系人职务")
    private String userTitle;

    /** 扩展字段 */
    @Excel(name = "扩展字段")
    private String extension;

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
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getTel()
    {
        return tel;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getLevel()
    {
        return level;
    }
    public void setSource(String source)
    {
        this.source = source;
    }

    public String getSource()
    {
        return source;
    }
    public void setIndustry(String industry)
    {
        this.industry = industry;
    }

    public String getIndustry()
    {
        return industry;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setFollowStatus(String followStatus)
    {
        this.followStatus = followStatus;
    }

    public String getFollowStatus()
    {
        return followStatus;
    }
    public void setInvoiceNo(Long invoiceNo)
    {
        this.invoiceNo = invoiceNo;
    }

    public Long getInvoiceNo()
    {
        return invoiceNo;
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
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setDeptId(Long deptId)
    {
        this.deptId = deptId;
    }

    public Long getDeptId()
    {
        return deptId;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }
    public void setPostCode(String postCode)
    {
        this.postCode = postCode;
    }

    public String getPostCode()
    {
        return postCode;
    }
    public void setPostName(String postName)
    {
        this.postName = postName;
    }

    public String getPostName()
    {
        return postName;
    }
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    public String getLoginName()
    {
        return loginName;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }
    public void setUserDept(String userDept)
    {
        this.userDept = userDept;
    }

    public String getUserDept()
    {
        return userDept;
    }
    public void setUserTitle(String userTitle)
    {
        this.userTitle = userTitle;
    }

    public String getUserTitle()
    {
        return userTitle;
    }
    public void setExtension(String extension)
    {
        this.extension = extension;
    }

    public String getExtension()
    {
        return extension;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("companyCode", getCompanyCode())
                .append("companyName", getCompanyName())
                .append("userName", getUserName())
                .append("phone", getPhone())
                .append("tel", getTel())
                .append("email", getEmail())
                .append("sex", getSex())
                .append("level", getLevel())
                .append("source", getSource())
                .append("industry", getIndustry())
                .append("status", getStatus())
                .append("followStatus", getFollowStatus())
                .append("invoiceNo", getInvoiceNo())
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
                .append("userId", getUserId())
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("postId", getPostId())
                .append("postCode", getPostCode())
                .append("postName", getPostName())
                .append("loginName", getLoginName())
                .append("delFlag", getDelFlag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("userDept", getUserDept())
                .append("userTitle", getUserTitle())
                .append("extension", getExtension())
                .toString();
    }
}
