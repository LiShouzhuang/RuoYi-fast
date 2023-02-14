package com.ruoyi.project.customer.order.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 订单对象 com_order
 * 
 * @author 李守壮
 * @date 2023-02-14
 */
public class ComOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long id;

    /** 订单编码 */
    @Excel(name = "订单编码")
    private String orderCode;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private Long amount;

    /** 邮费 */
    @Excel(name = "邮费")
    private Long postFee;

    /** 实付金额 */
    @Excel(name = "实付金额")
    private Long payment;

    /** 订单类型 */
    @Excel(name = "订单类型")
    private String orderType;

    /** 订单类型名称 */
    @Excel(name = "订单类型名称")
    private String orderTypeName;

    /** 订单开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderStartName;

    /** 订单结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderEndName;

    /** 客户id */
    @Excel(name = "客户id")
    private String customerId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 客户联系人名称 */
    @Excel(name = "客户联系人名称")
    private String companyUserName;

    /** 客户职务 */
    @Excel(name = "客户职务")
    private String companyTitle;

    /** 客户联系人电话 */
    @Excel(name = "客户联系人电话")
    private String mobile;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paymentType;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String status;

    /** 员工id */
    @Excel(name = "员工id")
    private Long staffId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String staffName;

    /** 渠道id */
    @Excel(name = "渠道id")
    private Long channelId;

    /** 渠道代码 */
    @Excel(name = "渠道代码")
    private String channelCode;

    /** 上级渠道id */
    @Excel(name = "上级渠道id")
    private Long parentChannelId;

    /** 渠道名称 */
    @Excel(name = "渠道名称")
    private String channelName;

    /** 产品id */
    @Excel(name = "产品id")
    private Long productId;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String productCode;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 支付流水号 */
    @Excel(name = "支付流水号")
    private String paymentCode;

    /** 是否开发票 */
    @Excel(name = "是否开发票")
    private String isInvoiceFlag;

    /** 发票号 */
    @Excel(name = "发票号")
    private String invoiceNo;

    /** 发票金额 */
    @Excel(name = "发票金额")
    private String invoiceAmount;

    /** 是否快递 */
    @Excel(name = "是否快递")
    private String isPostFlag;

    /** 快递号 */
    @Excel(name = "快递号")
    private String postNo;

    /** 快递开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "快递开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date postStartDate;

    /** 快递结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "快递结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date postEndDate;

    /** 快递完成状态 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "快递完成状态", width = 30, dateFormat = "yyyy-MM-dd")
    private Date postStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 删除标识 */
    @Excel(name = "删除标识")
    private String isDeleted;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setOrderCode(String orderCode)
    {
        this.orderCode = orderCode;
    }

    public String getOrderCode()
    {
        return orderCode;
    }
    public void setAmount(Long amount)
    {
        this.amount = amount;
    }

    public Long getAmount()
    {
        return amount;
    }
    public void setPostFee(Long postFee)
    {
        this.postFee = postFee;
    }

    public Long getPostFee()
    {
        return postFee;
    }
    public void setPayment(Long payment)
    {
        this.payment = payment;
    }

    public Long getPayment()
    {
        return payment;
    }
    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }

    public String getOrderType()
    {
        return orderType;
    }
    public void setOrderTypeName(String orderTypeName)
    {
        this.orderTypeName = orderTypeName;
    }

    public String getOrderTypeName()
    {
        return orderTypeName;
    }
    public void setOrderStartName(Date orderStartName)
    {
        this.orderStartName = orderStartName;
    }

    public Date getOrderStartName()
    {
        return orderStartName;
    }
    public void setOrderEndName(Date orderEndName)
    {
        this.orderEndName = orderEndName;
    }

    public Date getOrderEndName()
    {
        return orderEndName;
    }
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerId()
    {
        return customerId;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return customerName;
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
    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    public String getPaymentType()
    {
        return paymentType;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setStaffId(Long staffId)
    {
        this.staffId = staffId;
    }

    public Long getStaffId()
    {
        return staffId;
    }
    public void setStaffName(String staffName)
    {
        this.staffName = staffName;
    }

    public String getStaffName()
    {
        return staffName;
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
    public void setParentChannelId(Long parentChannelId)
    {
        this.parentChannelId = parentChannelId;
    }

    public Long getParentChannelId()
    {
        return parentChannelId;
    }
    public void setChannelName(String channelName)
    {
        this.channelName = channelName;
    }

    public String getChannelName()
    {
        return channelName;
    }
    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public Long getProductId()
    {
        return productId;
    }
    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getProductCode()
    {
        return productCode;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }
    public void setPaymentCode(String paymentCode)
    {
        this.paymentCode = paymentCode;
    }

    public String getPaymentCode()
    {
        return paymentCode;
    }
    public void setIsInvoiceFlag(String isInvoiceFlag)
    {
        this.isInvoiceFlag = isInvoiceFlag;
    }

    public String getIsInvoiceFlag()
    {
        return isInvoiceFlag;
    }
    public void setInvoiceNo(String invoiceNo)
    {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceNo()
    {
        return invoiceNo;
    }
    public void setInvoiceAmount(String invoiceAmount)
    {
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceAmount()
    {
        return invoiceAmount;
    }
    public void setIsPostFlag(String isPostFlag)
    {
        this.isPostFlag = isPostFlag;
    }

    public String getIsPostFlag()
    {
        return isPostFlag;
    }
    public void setPostNo(String postNo)
    {
        this.postNo = postNo;
    }

    public String getPostNo()
    {
        return postNo;
    }
    public void setPostStartDate(Date postStartDate)
    {
        this.postStartDate = postStartDate;
    }

    public Date getPostStartDate()
    {
        return postStartDate;
    }
    public void setPostEndDate(Date postEndDate)
    {
        this.postEndDate = postEndDate;
    }

    public Date getPostEndDate()
    {
        return postEndDate;
    }
    public void setPostStatus(Date postStatus)
    {
        this.postStatus = postStatus;
    }

    public Date getPostStatus()
    {
        return postStatus;
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
    public void setIsDeleted(String isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted()
    {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderCode", getOrderCode())
            .append("amount", getAmount())
            .append("postFee", getPostFee())
            .append("payment", getPayment())
            .append("orderType", getOrderType())
            .append("orderTypeName", getOrderTypeName())
            .append("orderStartName", getOrderStartName())
            .append("orderEndName", getOrderEndName())
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("companyUserName", getCompanyUserName())
            .append("companyTitle", getCompanyTitle())
            .append("mobile", getMobile())
            .append("paymentType", getPaymentType())
            .append("status", getStatus())
            .append("staffId", getStaffId())
            .append("staffName", getStaffName())
            .append("channelId", getChannelId())
            .append("channelCode", getChannelCode())
            .append("parentChannelId", getParentChannelId())
            .append("channelName", getChannelName())
            .append("productId", getProductId())
            .append("productCode", getProductCode())
            .append("productName", getProductName())
            .append("paymentCode", getPaymentCode())
            .append("isInvoiceFlag", getIsInvoiceFlag())
            .append("invoiceNo", getInvoiceNo())
            .append("invoiceAmount", getInvoiceAmount())
            .append("isPostFlag", getIsPostFlag())
            .append("postNo", getPostNo())
            .append("postStartDate", getPostStartDate())
            .append("postEndDate", getPostEndDate())
            .append("postStatus", getPostStatus())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("updateDate", getUpdateDate())
            .append("updateBy", getUpdateBy())
            .append("isDeleted", getIsDeleted())
            .append("remark", getRemark())
            .toString();
    }
}
