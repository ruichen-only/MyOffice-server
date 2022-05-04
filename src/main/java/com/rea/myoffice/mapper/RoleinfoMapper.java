package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Roleinfo;
import com.rea.myoffice.model.RoleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleinfoMapper {
    long countByExample(RoleinfoExample example);

    int deleteByExample(RoleinfoExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Roleinfo record);

    int insertSelective(Roleinfo record);

    List<Roleinfo> selectByExample(RoleinfoExample example);

    Roleinfo selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByExample(@Param("record") Roleinfo record, @Param("example") RoleinfoExample example);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);
}