package com.example.develop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/main","/member/join","/member/login" , "/css/**", "/js/**", "/images/**", "/layouts/**", "/index.jsp").permitAll()
                .antMatchers("/member/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/member/login")
                .usernameParameter("memberName")
                .passwordParameter("memberPw")
                .loginProcessingUrl("/loginProc")
                .defaultSuccessUrl("/")
                .and()
                .logout()
                .logoutUrl("/member/logout")
                .logoutSuccessUrl("/");
        return http.build();
    }

}
