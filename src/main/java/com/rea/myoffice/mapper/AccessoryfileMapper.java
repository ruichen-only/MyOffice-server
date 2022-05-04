package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Accessoryfile;
import com.rea.myoffice.model.AccessoryfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryfileMapper {
    long countByExample(AccessoryfileExample example);

    int deleteByExample(AccessoryfileExample example);

    int deleteByPrimaryKey(Integer accessoryid);

    int insert(Accessoryfile record);

    int insertSelective(Accessoryfile record);

    List<Accessoryfile> selectByExample(AccessoryfileExample example);

    Accessoryfile selectByPrimaryKey(Integer accessoryid);

    int updateByExampleSelective(@Param("record") Accessoryfile record, @Param("example") AccessoryfileExample example);

    int updateByExample(@Param("record") Accessoryfile record, @Param("example") AccessoryfileExample example);

    int updateByPrimaryKeySelective(Accessoryfile record);

    int updateByPrimaryKey(Accessoryfile record);
}