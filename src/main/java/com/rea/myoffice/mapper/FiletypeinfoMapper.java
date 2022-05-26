package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Filetypeinfo;
import com.rea.myoffice.model.FiletypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletypeinfoMapper {
    long countByExample(FiletypeinfoExample example);

    int deleteByExample(FiletypeinfoExample example);

    int deleteByPrimaryKey(Integer filetypeid);

    int insert(Filetypeinfo row);

    int insertSelective(Filetypeinfo row);

    List<Filetypeinfo> selectByExample(FiletypeinfoExample example);

    Filetypeinfo selectByPrimaryKey(Integer filetypeid);

    int updateByExampleSelective(@Param("row") Filetypeinfo row, @Param("example") FiletypeinfoExample example);

    int updateByExample(@Param("row") Filetypeinfo row, @Param("example") FiletypeinfoExample example);

    int updateByPrimaryKeySelective(Filetypeinfo row);

    int updateByPrimaryKey(Filetypeinfo row);
}