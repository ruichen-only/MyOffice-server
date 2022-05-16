package com.rea.myoffice.service;

import com.rea.myoffice.bean.ScheduleBean;

import java.util.List;

/**
 * @author CRR
 */
public interface ScheduleService {
  /**
   * 查询所有的
   *
   * @return
   */
  List<ScheduleBean> findAll();
}
