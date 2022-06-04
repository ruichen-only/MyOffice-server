package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Roleinfo;
import com.rea.myoffice.model.RoleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleinfoMapper {
    long countByExample(RoleinfoExample example);

    int deleteByExample(RoleinfoExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Roleinfo row);

    int insertSelective(Roleinfo row);

    List<Roleinfo> selectByExample(RoleinfoExample example);

    Roleinfo selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("row") Roleinfo row, @Param("example") RoleinfoExample example);

    int updateByExample(@Param("row") Roleinfo row, @Param("example") RoleinfoExample example);

    int updateByPrimaryKeySelective(Roleinfo row);

    int updateByPrimaryKey(Roleinfo row);
}