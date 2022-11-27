package com.ruoyi.web.controller.pms.finance.inout.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收支明细对象 inoutmoney
 * 
 * @author ruoyi
 * @date 2022-11-27
 */
public class InOutMoney extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收支编号 */
    private Long id;

    /** 收/支 */
    @Excel(name = "收/支")
    private Long inOutFlag;

    /** 收支分类 */
    @Excel(name = "收支分类")
    private String type;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 收款/付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "收款/付款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setInOutFlag(Long inOutFlag) 
    {
        this.inOutFlag = inOutFlag;
    }

    public Long getInOutFlag() 
    {
        return inOutFlag;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("inOutFlag", getInOutFlag())
            .append("type", getType())
            .append("amount", getAmount())
            .append("payTime", getPayTime())
            .toString();
    }
}
