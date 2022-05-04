package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Meetinginfo;
import com.rea.myoffice.model.MeetinginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetinginfoMapper {
    long countByExample(MeetinginfoExample example);

    int deleteByExample(MeetinginfoExample example);

    int deleteByPrimaryKey(Integer meetingid);

    int insert(Meetinginfo record);

    int insertSelective(Meetinginfo record);

    List<Meetinginfo> selectByExample(MeetinginfoExample example);

    Meetinginfo selectByPrimaryKey(Integer meetingid);

    int updateByExampleSelective(@Param("record") Meetinginfo record, @Param("example") MeetinginfoExample example);

    int updateByExample(@Param("record") Meetinginfo record, @Param("example") MeetinginfoExample example);

    int updateByPrimaryKeySelective(Meetinginfo record);

    int updateByPrimaryKey(Meetinginfo record);
}