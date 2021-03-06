package com.rea.myoffice.config;

import com.rea.myoffice.component.JwtAuthenticationTokenFilter;
import com.rea.myoffice.component.RestAuthenticationEntryPoint;
import com.rea.myoffice.component.RestfulAccessDeniedHandler;
import com.rea.myoffice.util.JwtTokenUtil;
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
  private final JwtTokenUtil jwtTokenUtil;

  @Autowired
  public SecurityConfig(
      UserDetailsService userDetailsService,
      RestfulAccessDeniedHandler restfulAccessDeniedHandler,
      RestAuthenticationEntryPoint restAuthenticationEntryPoint,
      JwtTokenUtil jwtTokenUtil) {
    this.userDetailsService = userDetailsService;
    this.restfulAccessDeniedHandler = restfulAccessDeniedHandler;
    this.restAuthenticationEntryPoint = restAuthenticationEntryPoint;
    this.jwtTokenUtil = jwtTokenUtil;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf() // ??????????????????JWT????????????????????????csrf
        .disable()
        .sessionManagement() // ??????token??????????????????session
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authorizeRequests()
        // ????????????????????????????????????????????????
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
        // ????????????????????????????????????
        .antMatchers("/dev-api/user/login")
        .permitAll()
        // ??????????????????????????????options??????
        .antMatchers(HttpMethod.OPTIONS)
        .permitAll()
        //                .antMatchers("/**")//???????????????????????????
        //                .permitAll()
        .anyRequest() // ???????????????????????????????????????????????????
        .authenticated();
    // ????????????
    http.headers().cacheControl();
    // ??????JWT filter
    http.addFilterBefore(
        jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    // ????????????????????????????????????????????????
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
    // ????????????????????????
    return username -> {
      UserDetails userinfo = userDetailsService.loadUserByUsername(username);
      if (userinfo != null) {
        return userinfo;
      }
      throw new UsernameNotFoundException("????????????????????????");
    };
  }

  @Bean
  public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
    return new JwtAuthenticationTokenFilter(userDetailsService, jwtTokenUtil);
  }

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }
}
