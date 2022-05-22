package com.rea.myoffice.service;

import com.rea.myoffice.bean.UserBean;
import com.rea.myoffice.model.Userinfo;

import java.util.List;

/**
 * @author CRR
 */
public interface UserService {

  /**
   * 判断数据库中指定的用户名+密码是否存在
   *
   * @param username 用户名
   * @param password 密码
   * @return 存在时返回TRUE，否则返回FALSE
   */
  String login(String username, String password);

  /**
   * 查询所有的用户信息
   *
   * @return
   */
  List<UserBean> findAll();

  /**
   * 根据主键ID删除用户
   *
   * @param userId 用户ID
   * @return 操作的数据行数
   */
  int deleteById(String userId);

  /**
   * 根据主键ID列表删除用户
   *
   * @param userIds 用户ID列表
   * @return 操作的数据行数
   */
  int deleteByIds(List<String> userIds);

  /**
   * 插入用户数据
   *
   * @param userinfo 用户信息
   * @return 操作的数据行数
   */
  int createUser(Userinfo userinfo);

  /**
   * 更新用户信息
   *
   * @param userinfo 用户信息
   * @return 操作的数据行数
   */
  int updateById(Userinfo userinfo);
}
