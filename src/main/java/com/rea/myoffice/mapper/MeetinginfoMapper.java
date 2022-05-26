package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Meetinginfo;
import com.rea.myoffice.model.MeetinginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetinginfoMapper {
    long countByExample(MeetinginfoExample example);

    int deleteByExample(MeetinginfoExample example);

    int deleteByPrimaryKey(Integer meetingid);

    int insert(Meetinginfo row);

    int insertSelective(Meetinginfo row);

    List<Meetinginfo> selectByExample(MeetinginfoExample example);

    Meetinginfo selectByPrimaryKey(Integer meetingid);

    int updateByExampleSelective(@Param("row") Meetinginfo row, @Param("example") MeetinginfoExample example);

    int updateByExample(@Param("row") Meetinginfo row, @Param("example") MeetinginfoExample example);

    int updateByPrimaryKeySelective(Meetinginfo row);

    int updateByPrimaryKey(Meetinginfo row);
}