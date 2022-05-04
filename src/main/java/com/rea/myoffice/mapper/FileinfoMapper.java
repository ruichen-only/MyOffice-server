package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Fileinfo;
import com.rea.myoffice.model.FileinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileinfoMapper {
    long countByExample(FileinfoExample example);

    int deleteByExample(FileinfoExample example);

    int deleteByPrimaryKey(Integer fileid);

    int insert(Fileinfo record);

    int insertSelective(Fileinfo record);

    List<Fileinfo> selectByExample(FileinfoExample example);

    Fileinfo selectByPrimaryKey(Integer fileid);

    int updateByExampleSelective(@Param("record") Fileinfo record, @Param("example") FileinfoExample example);

    int updateByExample(@Param("record") Fileinfo record, @Param("example") FileinfoExample example);

    int updateByPrimaryKeySelective(Fileinfo record);

    int updateByPrimaryKey(Fileinfo record);
}