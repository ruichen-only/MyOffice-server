package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Filetypeinfo;
import com.rea.myoffice.model.FiletypeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiletypeinfoMapper {
    long countByExample(FiletypeinfoExample example);

    int deleteByExample(FiletypeinfoExample example);

    int deleteByPrimaryKey(Integer filetypeid);

    int insert(Filetypeinfo record);

    int insertSelective(Filetypeinfo record);

    List<Filetypeinfo> selectByExample(FiletypeinfoExample example);

    Filetypeinfo selectByPrimaryKey(Integer filetypeid);

    int updateByExampleSelective(@Param("record") Filetypeinfo record, @Param("example") FiletypeinfoExample example);

    int updateByExample(@Param("record") Filetypeinfo record, @Param("example") FiletypeinfoExample example);

    int updateByPrimaryKeySelective(Filetypeinfo record);

    int updateByPrimaryKey(Filetypeinfo record);
}