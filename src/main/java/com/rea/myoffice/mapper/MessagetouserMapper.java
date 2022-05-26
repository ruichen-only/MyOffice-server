package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Messagetouser;
import com.rea.myoffice.model.MessagetouserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagetouserMapper {
    long countByExample(MessagetouserExample example);

    int deleteByExample(MessagetouserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Messagetouser row);

    int insertSelective(Messagetouser row);

    List<Messagetouser> selectByExample(MessagetouserExample example);

    Messagetouser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Messagetouser row, @Param("example") MessagetouserExample example);

    int updateByExample(@Param("row") Messagetouser row, @Param("example") MessagetouserExample example);

    int updateByPrimaryKeySelective(Messagetouser row);

    int updateByPrimaryKey(Messagetouser row);
}