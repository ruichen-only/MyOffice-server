package com.rea.myoffice.service;

import com.rea.myoffice.model.Branchinfo;

import java.util.List;

/**
 * @author CRR
 */
public interface BranchService {

  /**
   * 取得所有机构信息
   *
   * @return List
   */
  List<Branchinfo> findAll();

  /**
   * 根据主键ID删除机构
   *
   * @param branchId 机构ID
   * @return 操作的数据行数
   */
  int deleteById(int branchId);

  /**
   * 根据主键ID列表删除机构
   *
   * @param branchIds 机构ID列表
   * @return 操作的数据行数
   */
  int deleteByIds(List<Integer> branchIds);

  /**
   * 插入机构数据
   *
   * @param branchinfo 机构信息
   * @return 操作的数据行数
   */
  int createBranch(Branchinfo branchinfo);

  /**
   * 更新机构信息
   *
   * @param branchinfo 机构信息
   * @return 操作的数据行数
   */
  int updateById(Branchinfo branchinfo);
}
