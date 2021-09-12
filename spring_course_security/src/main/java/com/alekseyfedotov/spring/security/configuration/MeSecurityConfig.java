package com.alekseyfedotov.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class MeSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder
//                        .username("aleksey")
//                        .password("aleksey")
//                        .roles("EMPLOYEE"))
//                .withUser(userBuilder
//                        .username("slava")
//                        .password("slava")
//                        .roles("HR"))
//                .withUser(userBuilder.username("igor")
//                        .password("igor")
//                        .roles("MANAGER", "HR"));

        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                .antMatchers("/hr_info").hasAnyRole("HR")
                .antMatchers("/manager_info/**").hasAnyRole("MANAGER")
                .and().formLogin().permitAll();
    }
}
