package com.flythinker.springboot.sample.web1.web;

import com.flythinker.springboot.sample.web1.mapper.UserMapper;
import com.flythinker.springboot.sample.web1.message.RedisSendService;
import com.flythinker.springboot.sample.web1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisSendService redisSendService;

    @RequestMapping("/get")
    public String user(@RequestParam("id") Long id) throws Exception {
        User user = userMapper.getUserById(id);
        redisSendService.test1();
        if(user == null){
            return "user is null";
        }else{
            return "user is " + user.toString() ;
        }

    }
}
