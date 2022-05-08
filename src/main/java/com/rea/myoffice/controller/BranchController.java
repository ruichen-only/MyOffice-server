package com.rea.myoffice.controller;

import com.rea.myoffice.model.Branchinfo;
import com.rea.myoffice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CRR
 */
@RestController
@RequestMapping("/dev-api/branch/")
public class BranchController {
  private static final String BRANCH_ID = "branchId";
  private static final String BRANCH_IDS = "branchIds";
  @Autowired private BranchService branchService;

  @GetMapping("findAll")
  public Map<String, Object> findAll() {
    Map<String, Object> result = new HashMap<>(2);

    result.put("code", 20000);
    result.put("data", branchService.findAll());

    return result;
  }

  @DeleteMapping("deleteById")
  public Map<String, Object> deleteById(@RequestBody Map<String, Integer> param) {
    Map<String, Object> result = new HashMap<>(2);

    if (branchService.deleteById(param.get(BRANCH_ID)) > 0) {
      result.put("code", 20000);
      result.put("msg", "机构删除成功");
    }
    return result;
  }

  @DeleteMapping("deleteByIds")
  public Map<String, Object> deleteByIds(@RequestBody Map<String, List<Integer>> param) {
    Map<String, Object> result = new HashMap<>(2);

    if (branchService.deleteByIds(param.get(BRANCH_IDS)) > 0) {
      result.put("code", 20000);
      result.put("msg", "机构删除成功");
    }
    return result;
  }

  @PostMapping("create")
  public Map<String, Object> create(@RequestBody Branchinfo branchinfo) {
    Map<String, Object> result = new HashMap<>(2);

    branchService.createBranch(branchinfo);
    result.put("code", 20000);
    result.put("msg", "机构创建成功");

    return result;
  }

  @PutMapping("updateById")
  public Map<String, Object> updateById(@RequestBody Branchinfo branchinfo) {
    Map<String, Object> result = new HashMap<>(2);

    branchService.updateById(branchinfo);
    result.put("code", 20000);
    result.put("msg", "机构更新成功");

    return result;
  }
}
