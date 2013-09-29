/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 员工业绩和绩效考核项类型
 *
 * @author rooseek
 */
public enum PerformanceType implements BaseEnum {

    USER_OPEN_ACCOUNT("用户开户"),
    USER_INVESTIGATE("用户调查"),
    LOAN_REQUEST_SUBMIT("贷款申请提交"),
    LOAN_REQUEST_INVESTIGATE("贷款申请调查");

    private final String key;

    private PerformanceType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
