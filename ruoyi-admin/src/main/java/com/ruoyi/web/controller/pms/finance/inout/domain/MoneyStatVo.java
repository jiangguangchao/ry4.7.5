package com.ruoyi.web.controller.pms.finance.inout.domain;

import java.math.BigDecimal;

public class MoneyStatVo extends InOutMoney{
    private BigDecimal amountCount;

    public BigDecimal getAmountCount() {
        return amountCount;
    }

    public void setAmountCount(BigDecimal amountCount) {
        this.amountCount = amountCount;
    }
}
