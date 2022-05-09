package com.rea.myoffice.mapper;

import com.rea.myoffice.bean.DepartBean;
import com.rea.myoffice.model.Departinfo;
import com.rea.myoffice.model.DepartinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartinfoMapper {
  long countByExample(DepartinfoExample example);

  int deleteByExample(DepartinfoExample example);

  int deleteByPrimaryKey(Integer departid);

  int insert(Departinfo record);

  int insertSelective(Departinfo record);

  List<Departinfo> selectByExample(DepartinfoExample example);

  Departinfo selectByPrimaryKey(Integer departid);

  int updateByExampleSelective(
      @Param("record") Departinfo record, @Param("example") DepartinfoExample example);

  int updateByExample(
      @Param("record") Departinfo record, @Param("example") DepartinfoExample example);

  int updateByPrimaryKeySelective(Departinfo record);

  int updateByPrimaryKey(Departinfo record);

  List<DepartBean> findDepartAndBranchInfo(DepartinfoExample example);
}
