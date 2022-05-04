package com.rea.myoffice.controller;

import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CRR
 */
@RestController
@RequestMapping("/dev-api/user/")
public class LoginController {
  private static final String TOKEN = "admin-token";

  @Autowired private UserService userService;

  @RequestMapping("login")
  public Map<String, Object> login(@RequestBody Userinfo userinfo) {
    Map<String, Object> result = new HashMap<>(2);
    if (userService.login(userinfo.getUsername(), userinfo.getPassword())) {
      result.put("code", 20000);
      result.put("data", TOKEN);
    } else {
      result.put("code", 60204);
      result.put("message", "Account and password are incorrect.");
    }
    return result;
  }

  @GetMapping("info")
  public Map<String, Object> info(String token) {
    Map<String, Object> result = new HashMap<>(2);

    Map<String, Object> info = new HashMap<>(4);
    info.put("roles", Collections.singletonList("'admin'"));
    info.put("introduction", "I am a super administrator");
    info.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    info.put("name", "Super Admin");
    if (info != null) {
      result.put("code", 20000);
      result.put("data", info);
    } else {
      result.put("code", 50008);
      result.put("message", "Login failed, unable to get user details.");
    }
    return result;
  }
}
