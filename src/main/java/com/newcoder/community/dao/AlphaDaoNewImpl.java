package com.newcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AlphaDaoNewImpl
 * @Description TODO
 * @Author bill
 * @Date 2021/8/17 16:53
 * @Version 1.0
 **/
@Repository
//被优先调用
@Primary
public class AlphaDaoNewImpl implements AlphaDao {
    @Override
    public String select() {
        return "new";
    }
}
