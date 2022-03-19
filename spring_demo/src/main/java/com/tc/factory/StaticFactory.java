package com.tc.factory;

import com.tc.dao.UserDao;
import com.tc.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
