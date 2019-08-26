package com.fly.demo.shardingdemo.controller;

import com.fly.demo.shardingdemo.mapper.UserInfoMapper;
import com.fly.demo.shardingdemo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xiongfei
 * @Date 2019/8/26 15:16
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserInfoMapper userInfo0Mapper;

    @RequestMapping(value = "/add.do",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void addNewUser(UserInfo userInfo){
        userInfo0Mapper.insert(userInfo);
    }


}
