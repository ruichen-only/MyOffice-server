package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Schedule;
import com.rea.myoffice.model.ScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    long countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleid);

    int insert(Schedule row);

    int insertSelective(Schedule row);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer scheduleid);

    int updateByExampleSelective(@Param("row") Schedule row, @Param("example") ScheduleExample example);

    int updateByExample(@Param("row") Schedule row, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule row);

    int updateByPrimaryKey(Schedule row);
}