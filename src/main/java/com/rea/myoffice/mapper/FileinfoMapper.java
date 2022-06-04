package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Fileinfo;
import com.rea.myoffice.model.FileinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileinfoMapper {
    long countByExample(FileinfoExample example);

    int deleteByExample(FileinfoExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(Fileinfo row);

    int insertSelective(Fileinfo row);

    List<Fileinfo> selectByExample(FileinfoExample example);

    Fileinfo selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("row") Fileinfo row, @Param("example") FileinfoExample example);

    int updateByExample(@Param("row") Fileinfo row, @Param("example") FileinfoExample example);

    int updateByPrimaryKeySelective(Fileinfo row);

    int updateByPrimaryKey(Fileinfo row);
}