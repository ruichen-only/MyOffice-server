package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Roleright;
import com.rea.myoffice.model.RolerightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerightMapper {
    long countByExample(RolerightExample example);

    int deleteByExample(RolerightExample example);

    int deleteByPrimaryKey(Integer rolerightid);

    int insert(Roleright record);

    int insertSelective(Roleright record);

    List<Roleright> selectByExample(RolerightExample example);

    Roleright selectByPrimaryKey(Integer rolerightid);

    int updateByExampleSelective(@Param("record") Roleright record, @Param("example") RolerightExample example);

    int updateByExample(@Param("record") Roleright record, @Param("example") RolerightExample example);

    int updateByPrimaryKeySelective(Roleright record);

    int updateByPrimaryKey(Roleright record);
}