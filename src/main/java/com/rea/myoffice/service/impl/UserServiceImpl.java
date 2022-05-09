package com.rea.myoffice.service.impl;

import com.rea.myoffice.bean.UserBean;
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

  @Override
  public List<UserBean> findAll() {
    return userinfoMapper.findAllUserInfo(new UserinfoExample());
  }

  @Override
  public int deleteById(String userId) {
    UserinfoExample example = new UserinfoExample();
    example.createCriteria().andUseridEqualTo(userId);

    return userinfoMapper.deleteByExample(example);
  }

  @Override
  public int deleteByIds(List<String> userIds) {
    UserinfoExample example = new UserinfoExample();
    example.createCriteria().andUseridIn(userIds);

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
