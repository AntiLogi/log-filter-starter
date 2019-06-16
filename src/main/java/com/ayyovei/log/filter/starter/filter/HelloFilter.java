package com.ayyovei.log.filter.starter.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/6/16
 */
@Order(5)
@WebFilter(filterName = "helloFilter",urlPatterns = "/hello")
public class HelloFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(HelloFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("HelloFilter init.....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("hello filter,request uri is {}",((HttpServletRequest) servletRequest).getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("HelloFilter destroy.....");

    }
}
