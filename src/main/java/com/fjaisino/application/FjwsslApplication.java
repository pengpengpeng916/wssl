package com.fjaisino.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @ClassName FjwsslApplication
 * @Description
 * @Author wanyanzheng
 * @Date 2018/12/17 20:36.
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.fjaisino.application.mapper")
public class FjwsslApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FjwsslApplication.class);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(FjwsslApplication.class);
	}
}
