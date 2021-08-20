package com.newcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName AlphaDaoImpl
 * @Description TODO
 * @Author bill
 * @Date 2021/8/17 16:49
 * @Version 1.0
 **/
@Repository("alphahibernate")
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String select() {
        return "hibernate";
    }
}
