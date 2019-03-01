package com.fjaisino.application.controller;

import com.fjaisino.application.service.FjwsslService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 21:04
 **/
@RestController
public class FjwsslController {

    @Autowired
    FjwsslService fjwsslService;

    private static Logger logger = Logger.getLogger(FjwsslController.class);

    @RequestMapping(value = "/net/apply",method = RequestMethod.POST)
    public String fjwssl(@RequestBody String inputJson){
        logger.info("网上申领收到json: "+inputJson);
        String outputJson = fjwsslService.service(inputJson);
        logger.info("网上申领返回json: "+outputJson);
        return outputJson;
    }
}
