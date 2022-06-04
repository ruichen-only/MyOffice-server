package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Readcommonmessage;
import com.rea.myoffice.model.ReadcommonmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadcommonmessageMapper {
    long countByExample(ReadcommonmessageExample example);

    int deleteByExample(ReadcommonmessageExample example);

    int deleteByPrimaryKey(Integer readId);

    int insert(Readcommonmessage row);

    int insertSelective(Readcommonmessage row);

    List<Readcommonmessage> selectByExample(ReadcommonmessageExample example);

    Readcommonmessage selectByPrimaryKey(Integer readId);

    int updateByExampleSelective(@Param("row") Readcommonmessage row, @Param("example") ReadcommonmessageExample example);

    int updateByExample(@Param("row") Readcommonmessage row, @Param("example") ReadcommonmessageExample example);

    int updateByPrimaryKeySelective(Readcommonmessage row);

    int updateByPrimaryKey(Readcommonmessage row);
}