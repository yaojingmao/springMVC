package com.tc.factory;

import com.tc.dao.UserDao;
import com.tc.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
