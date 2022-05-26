package com.rea.myoffice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author CRR
 */
@Configuration
@EnableWebMvc
public class Swagger2Config {
  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        // 为当前包下controller生成API文档
        .apis(RequestHandlerSelectors.basePackage("com.rea.myoffice.controller"))
        // 为有@Api注解的Controller生成API文档
        //                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
        // 为有@ApiOperation注解的方法生成API文档
        //                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("SwaggerUI-MyOffice")
        .description("MyOffice")
        .version("1.0")
        .build();
  }
}
