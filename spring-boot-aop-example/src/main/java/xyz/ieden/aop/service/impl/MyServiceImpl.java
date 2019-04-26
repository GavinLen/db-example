package xyz.ieden.aop.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xyz.ieden.aop.entity.MyShardingField;
import xyz.ieden.aop.service.IMyService;

/**
 * @author lianghongwei01
 * @date 2019/4/25 17:38
 */
@Service
public class MyServiceImpl implements IMyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);

    @Override
    public String getC(MyShardingField field) {
        LOGGER.info("MyServiceImpl.getC(), Str:{}.", field.toString());
        return "c";
    }

    @Override
    public String getA(MyShardingField field, String name) {
        LOGGER.info("MyServiceImpl.getA(), Str:{}.", field.toString());
        return "a";
    }
}
