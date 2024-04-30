package com.doubleDimple.common.response;

import com.doubleDimple.common.exception.BaseErrorInfoInterface;
import lombok.Data;

@Data
public class ResultAPI {
    private int status;  //响应状态
    private String msg; //相应消息
    private String code;//响应代码
    public ResultAPI(){}

    /** 失败 **/
    public static ResultAPI error(BaseErrorInfoInterface errorInfo) {
        ResultAPI result = new ResultAPI();
        result.setCode(errorInfo.getResultCode());
        result.setMsg(errorInfo.getResultMsg());
        result.setStatus(0);
        return result;
    }
    /** 失败 **/
    public static ResultAPI error(String code, String message) {
        ResultAPI result = new ResultAPI();
        result.setCode(code);
        result.setMsg(message);
        result.setStatus(0);
        return result;
    }
    /** 失败 **/
    public static ResultAPI error(String message) {
        ResultAPI result = new ResultAPI();
        result.setStatus(0);
        result.setMsg(message);
        return result;
    }

}
