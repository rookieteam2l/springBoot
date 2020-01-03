package com.sunshine.free.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : Free
 * @Date : Create in
 * @Description: Swagger2API文档的配置
 * @Modified By:
 * @Version:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //是否开启swagger，正式环境一般是需要关闭的，可根据springboot的多环境配置进行设置
    //@Value(value = "${swagger.enabled}")
    //Boolean swaggerEnabled;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包下controller生成API文档
               // .apis(RequestHandlerSelectors.basePackage("com.robot"))
                //为有@Api注解的Controller生成API文档
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //为有@ApiOperation注解的方法生成API文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目接口说明")
                .description("Free")
                .contact("free")
                .version("1.0")
                .build();
    }

}
