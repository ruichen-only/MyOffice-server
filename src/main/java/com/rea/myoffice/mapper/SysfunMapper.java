package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Sysfun;
import com.rea.myoffice.model.SysfunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysfunMapper {
    long countByExample(SysfunExample example);

    int deleteByExample(SysfunExample example);

    int deleteByPrimaryKey(Integer nodeid);

    int insert(Sysfun row);

    int insertSelective(Sysfun row);

    List<Sysfun> selectByExample(SysfunExample example);

    Sysfun selectByPrimaryKey(Integer nodeid);

    int updateByExampleSelective(@Param("row") Sysfun row, @Param("example") SysfunExample example);

    int updateByExample(@Param("row") Sysfun row, @Param("example") SysfunExample example);

    int updateByPrimaryKeySelective(Sysfun row);

    int updateByPrimaryKey(Sysfun row);
}