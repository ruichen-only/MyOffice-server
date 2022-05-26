package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Precontract;
import com.rea.myoffice.model.PrecontractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrecontractMapper {
    long countByExample(PrecontractExample example);

    int deleteByExample(PrecontractExample example);

    int deleteByPrimaryKey(Integer precontractid);

    int insert(Precontract row);

    int insertSelective(Precontract row);

    List<Precontract> selectByExampleWithBLOBs(PrecontractExample example);

    List<Precontract> selectByExample(PrecontractExample example);

    Precontract selectByPrimaryKey(Integer precontractid);

    int updateByExampleSelective(@Param("row") Precontract row, @Param("example") PrecontractExample example);

    int updateByExampleWithBLOBs(@Param("row") Precontract row, @Param("example") PrecontractExample example);

    int updateByExample(@Param("row") Precontract row, @Param("example") PrecontractExample example);

    int updateByPrimaryKeySelective(Precontract row);

    int updateByPrimaryKeyWithBLOBs(Precontract row);

    int updateByPrimaryKey(Precontract row);
}