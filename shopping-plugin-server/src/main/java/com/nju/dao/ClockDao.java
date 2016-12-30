package com.nju.dao;

import com.nju.annotation.MybatisComponent;
import com.nju.entity.Clock;

/**
 * Created by Administrator on 2015/12/7.
 */
@MybatisComponent
public interface ClockDao {

    int insert(Clock clock);

    int deleteById(Integer id);

    Clock getClockById(Integer id);

}
