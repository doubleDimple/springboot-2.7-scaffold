package com.doubleDimple.common.interceptor;

import com.doubleDimple.common.domain.UserInfo;
import com.doubleDimple.common.utils.ThreadLocalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class UserInfoInterceptor implements HandlerInterceptor {

    private Logger log = LoggerFactory.getLogger(UserInfoInterceptor.class);


    /**
     * 请求执行前执行的，将用户信息放入ThreadLocal
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfo user;
        try {
            user = new UserInfo();
        } catch (Exception e) {
            log.info("***************************用户未登录， ThreadLocal无信息***************************");
            return true;
        }
        if (null != user) {
            log.info("***************************用户已登录，用户信息放入ThreadLocal***************************");
            ThreadLocalUtil.addCurrentUser(user);
            return true;
        }
        log.info("***************************用户未登录， ThreadLocal无信息***************************");
        return true;
    }

    /**
     * 接口访问结束后，从ThreadLocal中删除用户信息
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("***************************接口调用结束， 从ThreadLocal删除用户信息***************************");
        ThreadLocalUtil.remove();
    }
}

