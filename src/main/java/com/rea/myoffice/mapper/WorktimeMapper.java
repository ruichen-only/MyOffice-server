package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Worktime;
import com.rea.myoffice.model.WorktimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktimeMapper {
    long countByExample(WorktimeExample example);

    int deleteByExample(WorktimeExample example);

    int deleteByPrimaryKey(Integer worktimeid);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    List<Worktime> selectByExample(WorktimeExample example);

    Worktime selectByPrimaryKey(Integer worktimeid);

    int updateByExampleSelective(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByExample(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByPrimaryKeySelective(Worktime record);

    int updateByPrimaryKey(Worktime record);
}