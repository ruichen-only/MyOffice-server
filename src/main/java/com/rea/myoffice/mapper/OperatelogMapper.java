package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Operatelog;
import com.rea.myoffice.model.OperatelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatelogMapper {
    long countByExample(OperatelogExample example);

    int deleteByExample(OperatelogExample example);

    int deleteByPrimaryKey(Integer operateid);

    int insert(Operatelog record);

    int insertSelective(Operatelog record);

    List<Operatelog> selectByExample(OperatelogExample example);

    Operatelog selectByPrimaryKey(Integer operateid);

    int updateByExampleSelective(@Param("record") Operatelog record, @Param("example") OperatelogExample example);

    int updateByExample(@Param("record") Operatelog record, @Param("example") OperatelogExample example);

    int updateByPrimaryKeySelective(Operatelog record);

    int updateByPrimaryKey(Operatelog record);
}