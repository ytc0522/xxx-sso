/*
package com.xxx.sso.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 登录配置
//        http.formLogin()
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .loginProcessingUrl("/login")   // 自定义登录接口
//                .loginPage("/login.html")       // 自定义登录页面
//                //.defaultSuccessUrl(new,true) // 这个可以跳转到第三方页面
//                .successHandler(new MyAuthenticationSuccessHandler())
//                .failureForwardUrl("/login");  // 登录失败跳转

//        // 认证配置
//        http.authorizeRequests()
//                // 使用ant表达式
//                .antMatchers("/login.html").permitAll() // 登录页面不需要认证
//                .antMatchers("/css/**", "/js/**", "/img/**").permitAll()
//                .antMatchers("/oauth/**").permitAll()
//                //.regexMatchers("").permitAll() // 使用正则表达式
//                .antMatchers("/VIP.html").hasAnyRole(UserRoleEnum.ADMIN.getRoleDesc(), UserRoleEnum.VIP.getRoleDesc())
//                // 指定客户端的ip是多少才有权限
//                .antMatchers("/admin.html").hasIpAddress("127.0.0.1")
//                .anyRequest().authenticated();
//
//
//        //记住我功能
//        http.rememberMe()
//                .tokenValiditySeconds(5)
//                .userDetailsService(userDetailsService)
//                .tokenRepository(tokenRepository);


        // 退出登录
        http.logout().logoutSuccessUrl("/login.html");

        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }



}
*/
