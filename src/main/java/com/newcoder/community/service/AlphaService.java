package com.newcoder.community.service;

import com.newcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName AlphaService
 * @Description TODO
 * @Author bill
 * @Date 2021/8/17 17:00
 * @Version 1.0
 **/
@Service
//@Scope("prototype")
public class AlphaService {
    AlphaService() {
        System.out.println("实例化 AlphaService");
    }

    @Autowired
    private AlphaDao alphaDao;

    //在构造器之后调用
    @PostConstruct
    public void init() {
        System.out.println("初始化 AlphaService");
    }

    //在销毁前调用
    @PreDestroy
    public void destory() {
        System.out.println("销毁 AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }
}
