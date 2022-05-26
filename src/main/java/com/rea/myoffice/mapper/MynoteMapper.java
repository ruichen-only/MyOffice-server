package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Mynote;
import com.rea.myoffice.model.MynoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MynoteMapper {
    long countByExample(MynoteExample example);

    int deleteByExample(MynoteExample example);

    int deleteByPrimaryKey(Integer noteid);

    int insert(Mynote row);

    int insertSelective(Mynote row);

    List<Mynote> selectByExample(MynoteExample example);

    Mynote selectByPrimaryKey(Integer noteid);

    int updateByExampleSelective(@Param("row") Mynote row, @Param("example") MynoteExample example);

    int updateByExample(@Param("row") Mynote row, @Param("example") MynoteExample example);

    int updateByPrimaryKeySelective(Mynote row);

    int updateByPrimaryKey(Mynote row);
}