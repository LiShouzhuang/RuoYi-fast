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
 * @date 2023-02-13
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

    /** 员工id */
    @Excel(name = "员工id")
    private Long staffId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String staffName;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String status;

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
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
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
            .append("orderType", getOrderType())
            .append("orderTypeName", getOrderTypeName())
            .append("orderStartName", getOrderStartName())
            .append("orderEndName", getOrderEndName())
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("staffId", getStaffId())
            .append("staffName", getStaffName())
            .append("status", getStatus())
            .append("channelId", getChannelId())
            .append("channelCode", getChannelCode())
            .append("parentChannelId", getParentChannelId())
            .append("channelName", getChannelName())
            .append("productId", getProductId())
            .append("productCode", getProductCode())
            .append("productName", getProductName())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("updateDate", getUpdateDate())
            .append("updateBy", getUpdateBy())
            .append("isDeleted", getIsDeleted())
            .toString();
    }
}
