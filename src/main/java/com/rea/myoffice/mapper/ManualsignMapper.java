package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Manualsign;
import com.rea.myoffice.model.ManualsignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManualsignMapper {
    long countByExample(ManualsignExample example);

    int deleteByExample(ManualsignExample example);

    int deleteByPrimaryKey(Integer signId);

    int insert(Manualsign row);

    int insertSelective(Manualsign row);

    List<Manualsign> selectByExample(ManualsignExample example);

    Manualsign selectByPrimaryKey(Integer signId);

    int updateByExampleSelective(@Param("row") Manualsign row, @Param("example") ManualsignExample example);

    int updateByExample(@Param("row") Manualsign row, @Param("example") ManualsignExample example);

    int updateByPrimaryKeySelective(Manualsign row);

    int updateByPrimaryKey(Manualsign row);
}