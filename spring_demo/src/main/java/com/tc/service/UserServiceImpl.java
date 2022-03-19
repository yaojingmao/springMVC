package com.tc.service;

import com.tc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }
/* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void safe() {

        userDao.safe();
    }

}
