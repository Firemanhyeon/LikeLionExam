package org.blog.filterexam4.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.blog.filterexam4.entity.User;


import java.io.IOException;

public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try{
            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
            String auth = null;
            Cookie[] cookies = httpServletRequest.getCookies();
            if(cookies!=null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("auth")){
                        System.out.println("username찾았음"+cookie.getName());
                        auth = cookie.getValue();
                        break;
                    }
                }
            }
            if(auth != null){
                User user = new User();
                user.setUsername(auth);
                UserContext.setUser(user);
                System.out.println("컨텍스트에 넣기완료");
            }
            filterChain.doFilter(servletRequest , servletResponse);
        }finally {
            UserContext.clear();
        }
    }
}
