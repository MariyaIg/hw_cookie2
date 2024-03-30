package com.ignateva.hw_cookie2;

import com.ignateva.hw_cookie2.entity.UserType;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//@WebFilter(urlPatterns = "/secure/*", servletNames = {"servlet1","servlet2"})
public class ServletSecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
       HttpServletRequest servletRequest= (HttpServletRequest) request;
        HttpServletResponse servletRespons = (HttpServletResponse) response;

        HttpSession session = ((HttpServletRequest)request).getSession();

       UserType userType= (UserType) session.getAttribute("userType");

        if (userType == null||userType == UserType.GUEST){
            userType = UserType.GUEST;
            session.setAttribute("userType", userType);
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else
        {
            request.getRequestDispatcher("/user.jsp").forward(request,response);
        }

    }


}
