package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Accessoryfile;
import com.rea.myoffice.model.AccessoryfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryfileMapper {
    long countByExample(AccessoryfileExample example);

    int deleteByExample(AccessoryfileExample example);

    int deleteByPrimaryKey(Integer accessoryId);

    int insert(Accessoryfile row);

    int insertSelective(Accessoryfile row);

    List<Accessoryfile> selectByExample(AccessoryfileExample example);

    Accessoryfile selectByPrimaryKey(Integer accessoryId);

    int updateByExampleSelective(@Param("row") Accessoryfile row, @Param("example") AccessoryfileExample example);

    int updateByExample(@Param("row") Accessoryfile row, @Param("example") AccessoryfileExample example);

    int updateByPrimaryKeySelective(Accessoryfile row);

    int updateByPrimaryKey(Accessoryfile row);
}