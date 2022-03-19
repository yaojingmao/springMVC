package com.tc.dao.impl;

import com.tc.dao.UserDao;
import com.tc.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
   /* public UserDaoImpl() {
        System.out.println("spring容器已经创建。。。");
    }

    public void destroy(){
        System.out.println("销毁化方法。。。。");
    }

    public void init(){
        System.out.println("初始化方法。。。。");
    }*/
   /* private String username;
    private  int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    private List<String> list;
    private Map<String, User> map;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void safe() {
        System.out.println("safe() Running.....");
//        System.out.println(username+"======"+age);
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
    }
}
