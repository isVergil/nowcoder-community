package com.newcoder.community.service;

import com.newcoder.community.dao.DiscussPostMapper;
import com.newcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DiscussPostService
 * @Description TODO
 * @Author bill
 * @Date 2021/8/19 15:23
 * @Version 1.0
 **/
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userid, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userid, offset, limit);
    }

    public int findDiscussPostsRows(int userid) {
        return discussPostMapper.selectDiscussPostRows(userid);
    }
}
