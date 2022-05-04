package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Precontract;
import com.rea.myoffice.model.PrecontractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrecontractMapper {
    long countByExample(PrecontractExample example);

    int deleteByExample(PrecontractExample example);

    int deleteByPrimaryKey(Integer precontractid);

    int insert(Precontract record);

    int insertSelective(Precontract record);

    List<Precontract> selectByExampleWithBLOBs(PrecontractExample example);

    List<Precontract> selectByExample(PrecontractExample example);

    Precontract selectByPrimaryKey(Integer precontractid);

    int updateByExampleSelective(@Param("record") Precontract record, @Param("example") PrecontractExample example);

    int updateByExampleWithBLOBs(@Param("record") Precontract record, @Param("example") PrecontractExample example);

    int updateByExample(@Param("record") Precontract record, @Param("example") PrecontractExample example);

    int updateByPrimaryKeySelective(Precontract record);

    int updateByPrimaryKeyWithBLOBs(Precontract record);

    int updateByPrimaryKey(Precontract record);
}