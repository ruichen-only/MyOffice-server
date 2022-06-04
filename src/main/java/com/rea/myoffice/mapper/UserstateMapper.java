package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Userstate;
import com.rea.myoffice.model.UserstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserstateMapper {
    long countByExample(UserstateExample example);

    int deleteByExample(UserstateExample example);

    int deleteByPrimaryKey(Integer userStateId);

    int insert(Userstate row);

    int insertSelective(Userstate row);

    List<Userstate> selectByExample(UserstateExample example);

    Userstate selectByPrimaryKey(Integer userStateId);

    int updateByExampleSelective(@Param("row") Userstate row, @Param("example") UserstateExample example);

    int updateByExample(@Param("row") Userstate row, @Param("example") UserstateExample example);

    int updateByPrimaryKeySelective(Userstate row);

    int updateByPrimaryKey(Userstate row);
}