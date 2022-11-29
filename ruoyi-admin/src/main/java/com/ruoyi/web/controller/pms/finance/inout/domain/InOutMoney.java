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
 * @date 2022-11-29
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

    /** 用途大类 */
    @Excel(name = "用途大类")
    private String useMasterType;

    /** 支付/收款方式 */
    @Excel(name = "支付/收款方式")
    private String payType;

    /** 付款人 */
    @Excel(name = "付款人")
    private String payer;

    /** 收款人 */
    @Excel(name = "收款人")
    private String payee;

    /** 收款账号 */
    @Excel(name = "收款账号")
    private String colAccount;

    /** 付款账号 */
    @Excel(name = "付款账号")
    private String payAccount;

    /** 票据图片 */
    @Excel(name = "票据图片")
    private String billPic;

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
    public void setUseMasterType(String useMasterType)
    {
        this.useMasterType = useMasterType;
    }

    public String getUseMasterType()
    {
        return useMasterType;
    }
    public void setPayType(String payType)
    {
        this.payType = payType;
    }

    public String getPayType()
    {
        return payType;
    }
    public void setPayer(String payer)
    {
        this.payer = payer;
    }

    public String getPayer()
    {
        return payer;
    }
    public void setPayee(String payee)
    {
        this.payee = payee;
    }

    public String getPayee()
    {
        return payee;
    }
    public void setColAccount(String colAccount)
    {
        this.colAccount = colAccount;
    }

    public String getColAccount()
    {
        return colAccount;
    }
    public void setPayAccount(String payAccount)
    {
        this.payAccount = payAccount;
    }

    public String getPayAccount()
    {
        return payAccount;
    }
    public void setBillPic(String billPic)
    {
        this.billPic = billPic;
    }

    public String getBillPic()
    {
        return billPic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("inOutFlag", getInOutFlag())
                .append("type", getType())
                .append("amount", getAmount())
                .append("payTime", getPayTime())
                .append("useMasterType", getUseMasterType())
                .append("payType", getPayType())
                .append("payer", getPayer())
                .append("payee", getPayee())
                .append("colAccount", getColAccount())
                .append("payAccount", getPayAccount())
                .append("billPic", getBillPic())
                .append("remark", getRemark())
                .toString();
    }
}
