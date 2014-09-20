/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import com.creditcloud.model.BaseObject;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString
@XmlRootElement
public class UmpPaymentResult extends BaseObject {
    
    public static final UmpPaymentResult NETWORK_ERROR = new UmpPaymentResult("-1", "网络错误");
    public static final UmpPaymentResult SUCCESS = new UmpPaymentResult(UmpConstant.SUCCESS_CODE, UmpConstant.SUCCESS_MSG);
    
    private String retCode;

    private String retDesc;
    
    private String transactionId;

    public UmpPaymentResult() {
    }

    public UmpPaymentResult(String retCode, String retDesc) {
        this.retCode = retCode;
        this.retDesc = retDesc;
    }

    public UmpPaymentResult(String retCode, String retDesc, String transactionId) {
        this.retCode = retCode;
        this.retDesc = retDesc;
        this.transactionId = transactionId;
    } 
    
    public boolean success() {
        return UmpConstant.SUCCESS_CODE.equals(retCode);
    }
}