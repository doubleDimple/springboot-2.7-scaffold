package com.doubleDimple.common.exception;


import com.doubleDimple.common.response.ResultAPI;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionController {
    /**
     * 处理自定义的业务异常
     * @param req
     * @param exception
     * @return
     */
    @ExceptionHandler(value = CustomizationException.class)
    @ResponseBody
    public ResultAPI exception(HttpServletRequest req, CustomizationException exception) {
        return ResultAPI.error(exception.getErrorCode(), exception.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultAPI exceptionHandler(HttpServletRequest req, NullPointerException e) {
        return ResultAPI.error(ExceptionEnum.BODY_NOT_MATCH);
    }
}
