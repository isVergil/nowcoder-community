package com.newcoder.community;

import com.newcoder.community.dao.DiscussPostMapper;
import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.DiscussPost;
import com.newcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;

/**
 * @ClassName MapperTest
 * @Description TODO
 * @Author bill
 * @Date 2021/8/18 15:39
 * @Version 1.0
 **/
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(123);
        System.out.println(user);

        user = userMapper.selectByName("nowcoder13");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder22@sina.com");
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("chenyi");
        user.setPassword("chenyi");
        user.setEmail("chenyi");
        user.setCreateTime(new Date());
        System.out.println(userMapper.insertUser(user));
        System.out.println(user.getId());
    }

    @Test
    public void UpdateUser() {
        System.out.println(userMapper.updateStatus(150, 2));
        System.out.println(userMapper.updateHeader(150, "www.baidu.com"));
        System.out.println(userMapper.updatePassword(150, "bill"));
    }

    @Test
    public void selectDiscussPostTest() {
        System.out.println(discussPostMapper.selectDiscussPostRows(101));
        List<DiscussPost> res = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost re : res) {
            System.out.println(re);
        }

    }
}
