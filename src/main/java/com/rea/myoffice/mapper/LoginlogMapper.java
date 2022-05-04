package com.rea.myoffice.mapper;

import com.rea.myoffice.model.Loginlog;
import com.rea.myoffice.model.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogMapper {
    long countByExample(LoginlogExample example);

    int deleteByExample(LoginlogExample example);

    int deleteByPrimaryKey(Integer loginid);

    int insert(Loginlog record);

    int insertSelective(Loginlog record);

    List<Loginlog> selectByExample(LoginlogExample example);

    Loginlog selectByPrimaryKey(Integer loginid);

    int updateByExampleSelective(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByExample(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByPrimaryKeySelective(Loginlog record);

    int updateByPrimaryKey(Loginlog record);
}