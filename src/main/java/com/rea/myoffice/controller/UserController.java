package com.rea.myoffice.controller;

import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CRR
 */
@RestController
@RequestMapping("/dev-api/user/")
public class UserController {
  private static final String TOKEN = "admin-token";

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("login")
  public Map<String, Object> login(@RequestBody Userinfo userinfo) {
    Map<String, Object> result = new HashMap<>(2);
    String token = userService.login(userinfo.getUsername(), userinfo.getPassword());
    if (token != null) {
      result.put("code", 20000);
      // TODO:后续增加Authorization验证，生成token返回
      result.put("data", token);
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
    info.put("roles", Collections.singletonList("admin"));
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

  @RequestMapping("logout")
  public Map<String, Object> logout() {
    Map<String, Object> result = new HashMap<>(2);

    // TODO: 后续增加退出后台内存操作（或Redis）
    result.put("code", 20000);
    result.put("data", "success");

    return result;
  }

  @GetMapping("findAll")
  public Map<String, Object> findAll() {
    Map<String, Object> result = new HashMap<>(2);

    result.put("code", 20000);
    result.put("data", userService.findAll());
    return result;
  }

  @DeleteMapping("deleteByIds")
  public Map<String, Object> deleteByIds(@RequestBody Map<String, List<String>> param) {
    Map<String, Object> result = new HashMap<>(2);

    userService.deleteByIds(param.get("userIds"));
    result.put("code", 20000);
    result.put("msg", "用户删除成功");
    return result;
  }

  @DeleteMapping("deleteById")
  public Map<String, Object> deleteById(@RequestBody Map<String, String> param) {
    Map<String, Object> result = new HashMap<>(2);

    userService.deleteById(param.get("userId"));
    result.put("code", 20000);
    result.put("msg", "用户删除成功");
    return result;
  }

  @PostMapping("create")
  public Map<String, Object> create(@RequestBody Userinfo userinfo) {
    Map<String, Object> result = new HashMap<>(2);

    if (userService.createUser(userinfo) > 0) {
      result.put("code", 20000);
      result.put("msg", "用户创建成功");
    }
    return result;
  }

  @PutMapping("updateById")
  public Map<String, Object> updateById(@RequestBody Userinfo userinfo) {
    Map<String, Object> result = new HashMap<>(2);

    if (userService.updateById(userinfo) > 0) {
      result.put("code", 20000);
      result.put("msg", "用户更新成功");
    }
    return result;
  }
}
