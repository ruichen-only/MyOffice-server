package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Roleright;
import com.rea.myoffice.model.RolerightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerightMapper {
    long countByExample(RolerightExample example);

    int deleteByExample(RolerightExample example);

    int deleteByPrimaryKey(Integer rolerightid);

    int insert(Roleright row);

    int insertSelective(Roleright row);

    List<Roleright> selectByExample(RolerightExample example);

    Roleright selectByPrimaryKey(Integer rolerightid);

    int updateByExampleSelective(@Param("row") Roleright row, @Param("example") RolerightExample example);

    int updateByExample(@Param("row") Roleright row, @Param("example") RolerightExample example);

    int updateByPrimaryKeySelective(Roleright row);

    int updateByPrimaryKey(Roleright row);
}