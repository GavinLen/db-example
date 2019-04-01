package xyz.ieden.mpe.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ieden.mpe.eneity.User;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void selectList() {
        List<User> userList = userMapper.selectList(null);
        Assert.assertNotNull(userList);
        Assert.assertEquals(userList.size(), 5);
        userList.forEach(System.out::println);
    }

}