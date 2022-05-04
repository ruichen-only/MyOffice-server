package com.rea.myoffice.service;

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
  boolean login(String username, String password);
}
