package xyz.ieden.aop.service;

import xyz.ieden.aop.entity.MyShardingField;

/**
 * @author lianghongwei01
 * @date 2019/4/25 17:37
 */
public interface IMyService {


    String getC(MyShardingField field);

    String getA(MyShardingField field, String name);
}
