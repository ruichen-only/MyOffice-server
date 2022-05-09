package com.rea.myoffice.service;

import com.rea.myoffice.bean.DepartBean;
import com.rea.myoffice.model.Departinfo;

import java.util.List;

/**
 * @author CRR
 */
public interface DepartmentService {
  /**
   * 查询所有的部门信息
   *
   * @return
   */
  List<DepartBean> findAll();

  /**
   * 根据主键ID删除部门
   *
   * @param deptId 部门ID
   * @return 操作的数据行数
   */
  int deleteById(int deptId);

  /**
   * 根据主键ID列表删除部门
   *
   * @param deptIds 部门ID列表
   * @return 操作的数据行数
   */
  int deleteByIds(List<Integer> deptIds);

  /**
   * 插入部门数据
   *
   * @param department 部门信息
   * @return 操作的数据行数
   */
  int createDepart(Departinfo department);

  /**
   * 更新部门信息
   *
   * @param department 部门信息
   * @return 操作的数据行数
   */
  int updateById(Departinfo department);
}
