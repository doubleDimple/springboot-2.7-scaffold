package com.doubleDimple.common.exception;


public enum ExceptionEnum implements BaseErrorInfoInterface {

    SUCCESS("2000", "请求成功!"),
    BODY_NOT_MATCH("4000", "请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("4001", "请求的数字签名不匹配!"),
    DATA_EMPTY("4002", "数据为空！"),
    DATA_NOT_ENOUGH("4003", "数据不足！"),
    NOT_FOUND("4004", "数据不存在或已删除!"),
    DATA_FOUND("4005", "数据已存在！"),
    CODE_NOT_MATCH("4006", "验证码错误!"),
    CODE_TIME_OUT("4007", "验证码已过期!"),
    PASSWORD_NOT_MATCH("4008", "密码不一致!"),
    INTERNAL_SERVER_ERROR("5000", "服务器内部错误!"),
    SERVER_BUSY("5003", "服务器正忙，请稍后再试!");

    /**
     * 错误码
     */
    private final String resultCode;

    /**
     * 错误描述
     */
    private final String resultMsg;

    ExceptionEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
