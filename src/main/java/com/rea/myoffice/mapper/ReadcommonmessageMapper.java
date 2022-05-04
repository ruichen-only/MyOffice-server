package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Readcommonmessage;
import com.rea.myoffice.model.ReadcommonmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadcommonmessageMapper {
    long countByExample(ReadcommonmessageExample example);

    int deleteByExample(ReadcommonmessageExample example);

    int deleteByPrimaryKey(Integer readid);

    int insert(Readcommonmessage record);

    int insertSelective(Readcommonmessage record);

    List<Readcommonmessage> selectByExample(ReadcommonmessageExample example);

    Readcommonmessage selectByPrimaryKey(Integer readid);

    int updateByExampleSelective(@Param("record") Readcommonmessage record, @Param("example") ReadcommonmessageExample example);

    int updateByExample(@Param("record") Readcommonmessage record, @Param("example") ReadcommonmessageExample example);

    int updateByPrimaryKeySelective(Readcommonmessage record);

    int updateByPrimaryKey(Readcommonmessage record);
}