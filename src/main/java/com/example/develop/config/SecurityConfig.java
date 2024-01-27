package com.example.develop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrfConfig -> csrfConfig.disable())
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/", "/main", "/member/join", "/member/login", "/css/**", "/js/**", "/scss/**", "/vendor/**", "/images/**", "/layouts/**", "/img/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/", "/member/**").permitAll()
                                .requestMatchers("/member/**").hasRole("USER")
                                .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/member/login")
                                .usernameParameter("memberName")
                                .passwordParameter("memberPw")
                                .loginProcessingUrl("/loginProc")
                                .defaultSuccessUrl("/", true)
                )
                .logout(logout ->
                        logout
                                .logoutUrl("/member/logout")
                                .logoutSuccessUrl("/")
                );

        return http.build();
    }

}