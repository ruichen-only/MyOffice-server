package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Messagetype;
import com.rea.myoffice.model.MessagetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagetypeMapper {
    long countByExample(MessagetypeExample example);

    int deleteByExample(MessagetypeExample example);

    int deleteByPrimaryKey(Integer messagetypeid);

    int insert(Messagetype record);

    int insertSelective(Messagetype record);

    List<Messagetype> selectByExample(MessagetypeExample example);

    Messagetype selectByPrimaryKey(Integer messagetypeid);

    int updateByExampleSelective(@Param("record") Messagetype record, @Param("example") MessagetypeExample example);

    int updateByExample(@Param("record") Messagetype record, @Param("example") MessagetypeExample example);

    int updateByPrimaryKeySelective(Messagetype record);

    int updateByPrimaryKey(Messagetype record);
}