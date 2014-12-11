/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.UserNotification;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "notify")
public class UserRegisterNotification extends UserNotification {
    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public UserRegisterNotification() {
    }

    public UserRegisterNotification(String platformUserNo,
                                    String platformNo,
                                    BizType bizType,
                                    String code,
                                    String message,
                                    String requestNo) {
        super(platformUserNo, platformNo, bizType, code, message);
        this.requestNo = requestNo;
    }
    
    @XmlElement (name = "requestNo")
    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
    
}
