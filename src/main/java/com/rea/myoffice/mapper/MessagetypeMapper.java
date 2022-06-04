package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Messagetype;
import com.rea.myoffice.model.MessagetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagetypeMapper {
    long countByExample(MessagetypeExample example);

    int deleteByExample(MessagetypeExample example);

    int deleteByPrimaryKey(Integer messageTypeId);

    int insert(Messagetype row);

    int insertSelective(Messagetype row);

    List<Messagetype> selectByExample(MessagetypeExample example);

    Messagetype selectByPrimaryKey(Integer messageTypeId);

    int updateByExampleSelective(@Param("row") Messagetype row, @Param("example") MessagetypeExample example);

    int updateByExample(@Param("row") Messagetype row, @Param("example") MessagetypeExample example);

    int updateByPrimaryKeySelective(Messagetype row);

    int updateByPrimaryKey(Messagetype row);
}