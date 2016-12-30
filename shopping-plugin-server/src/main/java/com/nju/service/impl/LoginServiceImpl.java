package com.nju.service.impl;

import com.nju.dao.ClockDao;
import com.nju.entity.Clock;
import com.nju.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/12/4.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    ClockDao clockDao;

    public void login(String name, String password) {

    }

    public Clock getClockById(Integer id){
        Clock clock = clockDao.getClockById(id);
        return clock;
    }
}
