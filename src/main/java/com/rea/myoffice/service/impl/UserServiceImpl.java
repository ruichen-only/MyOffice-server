package com.rea.myoffice.service.impl;

import com.rea.myoffice.bean.UserBean;
import com.rea.myoffice.mapper.UserinfoMapper;
import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.model.UserinfoExample;
import com.rea.myoffice.service.UserService;
import com.rea.myoffice.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

  private final UserinfoMapper userinfoMapper;
  private final UserDetailsService userDetailsService;
  private final JwtTokenUtil jwtTokenUtil;
  private final PasswordEncoder passwordEncoder;

  @Autowired
  public UserServiceImpl(
      UserinfoMapper userinfoMapper,
      UserDetailsService userDetailsService,
      JwtTokenUtil jwtTokenUtil,
      PasswordEncoder passwordEncoder) {
    this.userinfoMapper = userinfoMapper;
    this.userDetailsService = userDetailsService;
    this.jwtTokenUtil = jwtTokenUtil;
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public String login(String username, String password) {
    String token = null;
    try {
      UserDetails userDetails = userDetailsService.loadUserByUsername(username);
      if (!passwordEncoder.matches(password, userDetails.getPassword())) {
        throw new BadCredentialsException("密码不正确");
      }
      Authentication authentication =
          new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
      SecurityContextHolder.getContext().setAuthentication(authentication);
      token = jwtTokenUtil.generateToken(userDetails);
    } catch (AuthenticationException e) {
      log.warn("登录异常:{}", e.getMessage());
    }
    return token;
  }

  @Override
  public List<UserBean> findAll() {
    return userinfoMapper.findAllUserInfo(new UserinfoExample());
  }

  @Override
  public int deleteById(String userId) {
    UserinfoExample example = new UserinfoExample();
    example.createCriteria().andUserIdEqualTo(userId);

    return userinfoMapper.deleteByExample(example);
  }

  @Override
  public int deleteByIds(List<String> userIds) {
    UserinfoExample example = new UserinfoExample();
    example.createCriteria().andUserIdIn(userIds);

    return userinfoMapper.deleteByExample(example);
  }

  @Override
  public int createUser(Userinfo userinfo) {
    return userinfoMapper.insertSelective(userinfo);
  }

  @Override
  public int updateById(Userinfo userinfo) {
    return userinfoMapper.updateByPrimaryKey(userinfo);
  }
}
