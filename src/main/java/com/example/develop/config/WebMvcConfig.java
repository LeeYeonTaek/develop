package com.example.develop.config;

import com.example.develop.interceptor.CustomInterceptor;
import com.example.develop.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    MemberService memberService;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor(memberService))
                .excludePathPatterns("/css/**", "/js/**", "/favicon.ico", "/error" ,"/scss/**","/vendor/**", "/images/**", "/layouts/**","/img/**");
    }
}
