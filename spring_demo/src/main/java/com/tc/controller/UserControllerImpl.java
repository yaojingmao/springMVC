package com.tc.controller;

import com.tc.dao.UserDao;
import com.tc.service.UserService;
import com.tc.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerImpl {


    public static void main(String[] args) {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        该方法可以获得多个bean，在配置文件配置多个bean
//        UserService userService = (UserService) app.getBean("userService");
//        改方法获得bean只能获取一次
        UserService userService = app.getBean(UserService.class);
        userService.safe();
    }

}
