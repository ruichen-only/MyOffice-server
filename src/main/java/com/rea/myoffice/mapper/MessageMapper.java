package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Message;
import com.rea.myoffice.model.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(Message row);

    int insertSelective(Message row);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("row") Message row, @Param("example") MessageExample example);

    int updateByExample(@Param("row") Message row, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message row);

    int updateByPrimaryKey(Message row);
}