package com.rea.myoffice.service.impl;

import com.rea.myoffice.constant.MessageConstant;
import com.rea.myoffice.mapper.UserinfoMapper;
import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.model.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  private final UserinfoMapper userinfoMapper;

  @Autowired
  public UserDetailsServiceImpl(UserinfoMapper userinfoMapper) {
    this.userinfoMapper = userinfoMapper;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserinfoExample userinfoExample = new UserinfoExample();
    userinfoExample.createCriteria().andUsernameEqualTo(username);

    List<Userinfo> userInfos = userinfoMapper.selectByExample(userinfoExample);
    if (userInfos == null) {
      throw new UsernameNotFoundException(MessageConstant.USERNAME_PASSWORD_ERROR);
    }
    return new UserDetailsImpl(userInfos.get(0));
  }
}
