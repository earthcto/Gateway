/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.TransStat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * 放款订单
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoanOrder extends BaseObject {

    private static final long serialVersionUID = 20141024L;

    private String loanId;

    private String investId;

    private String orderId;

    private LocalDate orderDate;

    private TransStat stat;

    public LoanOrder(String loanId,
                     String investId,
                     String orderId,
                     LocalDate orderDate,
                     TransStat stat) {
        this.loanId = loanId;
        this.investId = investId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.stat = stat;
    }

}