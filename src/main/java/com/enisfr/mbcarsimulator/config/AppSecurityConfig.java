package com.enisfr.mbcarsimulator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:application.yml")
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers(new String[]{"/vehicles/**", "/vehicles", "/auth"})
        .permitAll()
        .anyRequest().authenticated()
        .and()
        .csrf().disable()
        .oauth2Login();
  }



  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().mvcMatchers(
        "/v2/api-docs",
        "/api-docs",
        "/configuration/ui",
        "/swagger-resources/**",
        "/configuration/security",
        "/webjars/**",
        "/swagger-ui/**",
        "/v2/swagger.json");
  }

}
