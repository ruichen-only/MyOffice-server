package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Branchinfo;
import com.rea.myoffice.model.BranchinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchinfoMapper {
    long countByExample(BranchinfoExample example);

    int deleteByExample(BranchinfoExample example);

    int deleteByPrimaryKey(Integer branchid);

    int insert(Branchinfo record);

    int insertSelective(Branchinfo record);

    List<Branchinfo> selectByExample(BranchinfoExample example);

    Branchinfo selectByPrimaryKey(Integer branchid);

    int updateByExampleSelective(@Param("record") Branchinfo record, @Param("example") BranchinfoExample example);

    int updateByExample(@Param("record") Branchinfo record, @Param("example") BranchinfoExample example);

    int updateByPrimaryKeySelective(Branchinfo record);

    int updateByPrimaryKey(Branchinfo record);
}