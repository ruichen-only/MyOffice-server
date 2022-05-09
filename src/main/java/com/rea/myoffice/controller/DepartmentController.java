package com.rea.myoffice.controller;

import com.rea.myoffice.model.Departinfo;
import com.rea.myoffice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CRR
 */
@RestController
@RequestMapping("/dev-api/department/")
public class DepartmentController {
  private static final String DEPT_ID = "deptId";
  private static final String DEPT_IDS = "deptIds";

  @Autowired private DepartmentService departmentService;

  @GetMapping("findAll")
  public Map<String, Object> findAll() {
    Map<String, Object> result = new HashMap<>(2);

    result.put("code", 20000);
    result.put("data", departmentService.findAll());

    return result;
  }

  @DeleteMapping("deleteById")
  public Map<String, Object> deleteById(@RequestBody Map<String, Integer> param) {
    Map<String, Object> result = new HashMap<>(2);

    if (departmentService.deleteById(param.get(DEPT_ID)) > 0) {
      result.put("code", 20000);
      result.put("msg", "部门删除成功");
    }
    return result;
  }

  @DeleteMapping("deleteByIds")
  public Map<String, Object> deleteByIds(@RequestBody Map<String, List<Integer>> param) {
    Map<String, Object> result = new HashMap<>(2);

    if (departmentService.deleteByIds(param.get(DEPT_IDS)) > 0) {
      result.put("code", 20000);
      result.put("msg", "部门删除成功");
    }
    return result;
  }

  @PostMapping("create")
  public Map<String, Object> create(@RequestBody Departinfo departinfo) {
    Map<String, Object> result = new HashMap<>(2);

    departmentService.createDepart(departinfo);
    result.put("code", 20000);
    result.put("msg", "部门创建成功");

    return result;
  }

  @PutMapping("updateById")
  public Map<String, Object> updateById(@RequestBody Departinfo departinfo) {
    Map<String, Object> result = new HashMap<>(2);

    departmentService.updateById(departinfo);
    result.put("code", 20000);
    result.put("msg", "部门更新成功");

    return result;
  }
}
