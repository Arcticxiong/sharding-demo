package com.fly.demo.shardingdemo.service;

import com.fly.demo.shardingdemo.mapper.UserInfoMapper;
import com.fly.demo.shardingdemo.pojo.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author xiongfei
 * @Date 2019/8/26 15:41
 **/
@Service
public class TestService {

    @Resource
    UserInfoMapper userInfoMapper;

//    public static int userId = 150;

    public void demo() {
        System.out.println("Insert--------------");

        for (int i = 1; i <= 10; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(i);
            userInfo.setAccount("Account" + i);
            userInfo.setPassword("pass" + i);
            userInfo.setUserName("name" + i);
//            userId++;
            userInfoMapper.insert(userInfo);
        }
        System.out.println("over..........");
    }

    public void demo1(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(userInfoMapper.selectByPrimaryKey(i));
        }
    }
}
