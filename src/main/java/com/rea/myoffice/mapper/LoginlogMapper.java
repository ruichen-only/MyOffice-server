package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Loginlog;
import com.rea.myoffice.model.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogMapper {
    long countByExample(LoginlogExample example);

    int deleteByExample(LoginlogExample example);

    int deleteByPrimaryKey(Integer loginId);

    int insert(Loginlog row);

    int insertSelective(Loginlog row);

    List<Loginlog> selectByExample(LoginlogExample example);

    Loginlog selectByPrimaryKey(Integer loginId);

    int updateByExampleSelective(@Param("row") Loginlog row, @Param("example") LoginlogExample example);

    int updateByExample(@Param("row") Loginlog row, @Param("example") LoginlogExample example);

    int updateByPrimaryKeySelective(Loginlog row);

    int updateByPrimaryKey(Loginlog row);
}