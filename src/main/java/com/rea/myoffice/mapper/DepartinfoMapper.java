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

  int insert(Departinfo row);

  int insertSelective(Departinfo row);

  List<Departinfo> selectByExample(DepartinfoExample example);

  Departinfo selectByPrimaryKey(Integer departid);

  int updateByExampleSelective(
      @Param("row") Departinfo row, @Param("example") DepartinfoExample example);

  int updateByExample(@Param("row") Departinfo row, @Param("example") DepartinfoExample example);

  int updateByPrimaryKeySelective(Departinfo row);

  int updateByPrimaryKey(Departinfo row);

  List<DepartBean> findDepartAndBranchInfo(DepartinfoExample example);
}
