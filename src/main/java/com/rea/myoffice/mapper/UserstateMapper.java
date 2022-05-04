package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Userstate;
import com.rea.myoffice.model.UserstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserstateMapper {
    long countByExample(UserstateExample example);

    int deleteByExample(UserstateExample example);

    int deleteByPrimaryKey(Integer userstateid);

    int insert(Userstate record);

    int insertSelective(Userstate record);

    List<Userstate> selectByExample(UserstateExample example);

    Userstate selectByPrimaryKey(Integer userstateid);

    int updateByExampleSelective(@Param("record") Userstate record, @Param("example") UserstateExample example);

    int updateByExample(@Param("record") Userstate record, @Param("example") UserstateExample example);

    int updateByPrimaryKeySelective(Userstate record);

    int updateByPrimaryKey(Userstate record);
}