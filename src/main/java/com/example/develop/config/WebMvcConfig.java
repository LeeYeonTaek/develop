package com.example.develop.config;

import com.example.develop.interceptor.CustomInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor())
                .excludePathPatterns("/css/**", "/js/**", "/favicon.ico", "/error" ,"/scss/**","/vendor/**", "/images/**", "/layouts/**","/img/**");
    }
}
