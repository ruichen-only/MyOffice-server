package com.rea.myoffice.controller;

import com.rea.myoffice.mapper.RoleinfoMapper;
import com.rea.myoffice.model.RoleinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CRR
 */
@RestController
@RequestMapping("/dev-api/role/")
public class RoleController {
  @Autowired private RoleinfoMapper roleinfoMapper;

  @GetMapping("findAll")
  public Map<String, Object> findAll() {
    Map<String, Object> result = new HashMap<>(2);

    result.put("code", 20000);
    result.put("data", roleinfoMapper.selectByExample(new RoleinfoExample()));
    return result;
  }
}
