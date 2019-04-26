package xyz.ieden.aop.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ieden.aop.entity.MyShardingField;
import xyz.ieden.aop.service.IMyService;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author lianghongwei01
 * @date 2019/4/25 17:42
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MyServiceImplTest {

    @Autowired
    private IMyService myService;

    @Test
    public void getC() {
        MyShardingField field = new MyShardingField();
        field.setCityId(1);
        String c = myService.getC(field);
        Assert.assertNotNull(c);
    }

    @Test
    public void getA() {
        MyShardingField field = new MyShardingField();
        field.setCityId(1);
        String c = myService.getA(field, "A");
        Assert.assertNotNull(c);
    }

}