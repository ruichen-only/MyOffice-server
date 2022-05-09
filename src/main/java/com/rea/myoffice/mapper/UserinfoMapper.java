package com.rea.myoffice.mapper;

import com.rea.myoffice.bean.UserBean;
import com.rea.myoffice.model.Userinfo;
import com.rea.myoffice.model.UserinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoMapper {
  long countByExample(UserinfoExample example);

  int deleteByExample(UserinfoExample example);

  int deleteByPrimaryKey(String userid);

  int insert(Userinfo record);

  int insertSelective(Userinfo record);

  List<Userinfo> selectByExample(UserinfoExample example);

  Userinfo selectByPrimaryKey(String userid);

  int updateByExampleSelective(
      @Param("record") Userinfo record, @Param("example") UserinfoExample example);

  int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

  int updateByPrimaryKeySelective(Userinfo record);

  int updateByPrimaryKey(Userinfo record);

  List<UserBean> findAllUserInfo(UserinfoExample example);
}
