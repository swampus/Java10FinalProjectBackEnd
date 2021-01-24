package sda.finalproject.jgroup10.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class IPAddressInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        String ipAddress = request.getHeader("X-Forward-For");

        if(ipAddress== null){

            ipAddress = request.getRemoteAddr();
        }

        System.out.println(ipAddress);
        return false;
    }
}