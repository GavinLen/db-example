package xyz.ieden.simple.service.impl;

import xyz.ieden.common.entity.UserInfoEntity;
import xyz.ieden.common.util.Page;
import xyz.ieden.common.util.ResultSet;
import xyz.ieden.simple.service.IUserInfoService;

import java.util.List;

/**
 * @author gavin
 * @date 2019/4/14 8:18
 */
public class UserInfoServiceImpl implements IUserInfoService {
    @Override
    public ResultSet<Integer> insert(UserInfoEntity userInfoEntity) {
        return null;
    }

    @Override
    public ResultSet<Integer> delete(Integer id) {
        return null;
    }

    @Override
    public ResultSet<Integer> update(UserInfoEntity userInfoEntity) {
        return null;
    }

    @Override
    public ResultSet<UserInfoEntity> select(Integer integer) {
        return null;
    }

    @Override
    public ResultSet<List<UserInfoEntity>> select() {
        return null;
    }

    @Override
    public ResultSet<Page<UserInfoEntity>> select(Page<UserInfoEntity> page) {
        return null;
    }
}
