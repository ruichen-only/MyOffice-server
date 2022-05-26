package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Worktime;
import com.rea.myoffice.model.WorktimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktimeMapper {
    long countByExample(WorktimeExample example);

    int deleteByExample(WorktimeExample example);

    int deleteByPrimaryKey(Integer worktimeid);

    int insert(Worktime row);

    int insertSelective(Worktime row);

    List<Worktime> selectByExample(WorktimeExample example);

    Worktime selectByPrimaryKey(Integer worktimeid);

    int updateByExampleSelective(@Param("row") Worktime row, @Param("example") WorktimeExample example);

    int updateByExample(@Param("row") Worktime row, @Param("example") WorktimeExample example);

    int updateByPrimaryKeySelective(Worktime row);

    int updateByPrimaryKey(Worktime row);
}