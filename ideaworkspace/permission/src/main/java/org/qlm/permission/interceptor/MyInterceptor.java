package org.qlm.permission.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
* 登录拦截和权限认证
*
* */
public class MyInterceptor implements HandlerInterceptor {


    /*访问controller之前调用*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
          String strUrl=request.getServletPath();
          //登录拦截
        if(strUrl.equals("/user/login")||strUrl.equals("/user/checklogin")){
           System.out.println(request.getServletPath());
           return true;
        }


        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
