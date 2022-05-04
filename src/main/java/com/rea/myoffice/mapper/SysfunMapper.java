package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Sysfun;
import com.rea.myoffice.model.SysfunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysfunMapper {
    long countByExample(SysfunExample example);

    int deleteByExample(SysfunExample example);

    int deleteByPrimaryKey(Integer nodeid);

    int insert(Sysfun record);

    int insertSelective(Sysfun record);

    List<Sysfun> selectByExample(SysfunExample example);

    Sysfun selectByPrimaryKey(Integer nodeid);

    int updateByExampleSelective(@Param("record") Sysfun record, @Param("example") SysfunExample example);

    int updateByExample(@Param("record") Sysfun record, @Param("example") SysfunExample example);

    int updateByPrimaryKeySelective(Sysfun record);

    int updateByPrimaryKey(Sysfun record);
}