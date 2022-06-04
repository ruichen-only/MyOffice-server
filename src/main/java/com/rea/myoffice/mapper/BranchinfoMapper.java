package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Branchinfo;
import com.rea.myoffice.model.BranchinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchinfoMapper {
    long countByExample(BranchinfoExample example);

    int deleteByExample(BranchinfoExample example);

    int deleteByPrimaryKey(Integer branchId);

    int insert(Branchinfo row);

    int insertSelective(Branchinfo row);

    List<Branchinfo> selectByExample(BranchinfoExample example);

    Branchinfo selectByPrimaryKey(Integer branchId);

    int updateByExampleSelective(@Param("row") Branchinfo row, @Param("example") BranchinfoExample example);

    int updateByExample(@Param("row") Branchinfo row, @Param("example") BranchinfoExample example);

    int updateByPrimaryKeySelective(Branchinfo row);

    int updateByPrimaryKey(Branchinfo row);
}