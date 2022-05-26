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

  int insert(Userinfo row);

  int insertSelective(Userinfo row);

  List<Userinfo> selectByExample(UserinfoExample example);

  Userinfo selectByPrimaryKey(String userid);

  int updateByExampleSelective(
      @Param("row") Userinfo row, @Param("example") UserinfoExample example);

  int updateByExample(@Param("row") Userinfo row, @Param("example") UserinfoExample example);

  int updateByPrimaryKeySelective(Userinfo row);

  int updateByPrimaryKey(Userinfo row);

  List<UserBean> findAllUserInfo(UserinfoExample example);
}
