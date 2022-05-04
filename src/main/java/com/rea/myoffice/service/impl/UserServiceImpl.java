package com.rea.myoffice.service.impl;

import com.rea.myoffice.mapper.UserinfoMapper;
import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.model.UserinfoExample;
import com.rea.myoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CRR
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserinfoMapper userinfoMapper;

  @Override
  public boolean login(String username, String password) {
    UserinfoExample userinfoExample = new UserinfoExample();
    userinfoExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);

    List<Userinfo> userInfos = userinfoMapper.selectByExample(userinfoExample);

    return userInfos.size() > 0;
  }
}
