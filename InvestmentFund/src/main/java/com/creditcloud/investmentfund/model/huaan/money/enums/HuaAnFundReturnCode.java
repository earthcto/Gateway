/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.enums;

/**
 *
 * @author guohuazhang
 */
public enum HuaAnFundReturnCode {

    SUCCESS("0000", "操作成功"), APPLICATION_ACCEPTED("0000", "委托成功"), AWAITING_PAY("9999", "委托成功待付款");

    private String code;
    private String message;

    private HuaAnFundReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;

    }
}
