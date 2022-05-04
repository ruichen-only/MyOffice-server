package com.rea.myoffice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CRR
 */
@Configuration
@MapperScan({"com.rea.myoffice.mapper", "com.rea.myoffice.model"})
public class MybatisConfig {}
