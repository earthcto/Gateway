/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordStatus implements BaseEnum {

    INITIALIZED("初始"),
    SUCCESSFUL("成功"),
    PROCESSING("处理中"),
    FAILED("失败"),
    REJECTED("拒绝"),
    CANCELED("取消");

    private final String key;

    private FundRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}