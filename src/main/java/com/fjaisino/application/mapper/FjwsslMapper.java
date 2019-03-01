package com.fjaisino.application.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-18 14:24
 **/
@Repository
public interface FjwsslMapper {

    List<String> getFwskKdhh(String slxh);
	
	List<String> selectkddhs(String kddhs);
	
}
