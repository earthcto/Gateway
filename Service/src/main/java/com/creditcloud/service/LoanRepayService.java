/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface LoanRepayService {

    /**
     * list all repayment for a user by repayment status
     *
     * @param clientCode
     * @param userId
     * @param status
     * @return
     */
    List<LoanRepayment> listRepayByStatus(String clientCode, String userId, RepaymentStatus status);

    /**
     * list loan repayment by loanId
     *
     * @param clientCode
     * @param loanId
     * @return emptyList if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    List<LoanRepayment> listRepayByLoanId(String clientCode, String loanId);
}