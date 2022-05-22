package com.rea.myoffice.config;

import com.rea.myoffice.component.JwtAuthenticationTokenFilter;
import com.rea.myoffice.component.RestAuthenticationEntryPoint;
import com.rea.myoffice.component.RestfulAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author CRR
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  private final UserDetailsService userDetailsService;
  private final RestfulAccessDeniedHandler restfulAccessDeniedHandler;
  private final RestAuthenticationEntryPoint restAuthenticationEntryPoint;

  @Autowired
  public SecurityConfig(
      UserDetailsService userDetailsService,
      RestfulAccessDeniedHandler restfulAccessDeniedHandler,
      RestAuthenticationEntryPoint restAuthenticationEntryPoint) {
    this.userDetailsService = userDetailsService;
    this.restfulAccessDeniedHandler = restfulAccessDeniedHandler;
    this.restAuthenticationEntryPoint = restAuthenticationEntryPoint;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf() // 由于使用的是JWT，我们这里不需要csrf
        .disable()
        .sessionManagement() // 基于token，所以不需要session
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authorizeRequests()
        // 允许对于网站静态资源的无授权访问
        .antMatchers(
            HttpMethod.GET,
            "/",
            "/*.html",
            "/favicon.ico",
            "/**/*.html",
            "/**/*.css",
            "/**/*.js",
            "/swagger-resources/**",
            "/v2/api-docs/**")
        .permitAll()
        // 对登录注册要允许匿名访问
        .antMatchers("/dev-api/user/login")
        .permitAll()
        // 跨域请求会先进行一次options请求
        .antMatchers(HttpMethod.OPTIONS)
        .permitAll()
        //                .antMatchers("/**")//测试时全部运行访问
        //                .permitAll()
        .anyRequest() // 除上面外的所有请求全部需要鉴权认证
        .authenticated();
    // 禁用缓存
    http.headers().cacheControl();
    // 添加JWT filter
    http.addFilterBefore(
        jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    // 添加自定义未授权和未登录结果返回
    http.exceptionHandling()
        .accessDeniedHandler(restfulAccessDeniedHandler)
        .authenticationEntryPoint(restAuthenticationEntryPoint);
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  public UserDetailsService userDetailsService() {
    // 获取登录用户信息
    return username -> {
      UserDetails userinfo = userDetailsService.loadUserByUsername(username);
      if (userinfo != null) {
        return userinfo;
      }
      throw new UsernameNotFoundException("用户名或密码错误");
    };
  }

  @Bean
  public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
    return new JwtAuthenticationTokenFilter();
  }

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }
}
