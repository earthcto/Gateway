/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rooseek
 */
@Embeddable
public class Repayment extends BaseEntity {

    @Column(nullable = false)
    private BigDecimal amountPrincipal;

    @Column(nullable = false)
    private BigDecimal amountInterest;

    @Column(nullable = false)
    private BigDecimal amountOutstanding;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dueDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private RepaymentStatus status;

    public Repayment() {
    }

    public Repayment(BigDecimal amountPrincipal,
                     BigDecimal amountInterest,
                     BigDecimal amountOutstanding,
                     Date dueDate) {
        this(amountPrincipal, amountInterest, amountOutstanding, dueDate, null);
    }

    public Repayment(BigDecimal amountPrincipal,
                     BigDecimal amountInterest,
                     BigDecimal amountOutstanding,
                     Date dueDate,
                     RepaymentStatus status) {
        this.amountPrincipal = amountPrincipal;
        this.amountInterest = amountInterest;
        this.amountOutstanding = amountOutstanding;
        this.dueDate = dueDate;
        this.status = status;
    }

    public BigDecimal getAmountPrincipal() {
        return amountPrincipal;
    }

    public BigDecimal getAmountInterest() {
        return amountInterest;
    }

    public BigDecimal getAmountOutstanding() {
        return amountOutstanding;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public RepaymentStatus getStatus() {
        return status;
    }

    public void setAmountPrincipal(BigDecimal amountPrincipal) {
        this.amountPrincipal = amountPrincipal;
    }

    public void setAmountInterest(BigDecimal amountInterest) {
        this.amountInterest = amountInterest;
    }

    public void setAmountOutstanding(BigDecimal amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(RepaymentStatus status) {
        this.status = status;
    }
}