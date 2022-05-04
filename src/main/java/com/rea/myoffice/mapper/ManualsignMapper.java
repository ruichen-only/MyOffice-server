package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Manualsign;
import com.rea.myoffice.model.ManualsignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManualsignMapper {
    long countByExample(ManualsignExample example);

    int deleteByExample(ManualsignExample example);

    int deleteByPrimaryKey(Integer signid);

    int insert(Manualsign record);

    int insertSelective(Manualsign record);

    List<Manualsign> selectByExample(ManualsignExample example);

    Manualsign selectByPrimaryKey(Integer signid);

    int updateByExampleSelective(@Param("record") Manualsign record, @Param("example") ManualsignExample example);

    int updateByExample(@Param("record") Manualsign record, @Param("example") ManualsignExample example);

    int updateByPrimaryKeySelective(Manualsign record);

    int updateByPrimaryKey(Manualsign record);
}