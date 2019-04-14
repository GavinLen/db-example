package xyz.ieden.common.service;

import xyz.ieden.common.util.Page;
import xyz.ieden.common.util.ResultSet;

import java.util.List;

/**
 * @author gavin
 * @date 2019/4/13 23:47
 */
public interface CommonService<T, K> {

    /**
     * 添加
     *
     * @param t
     * @return
     */
    ResultSet<K> insert(T t);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    ResultSet<Integer> delete(K id);

    /**
     * 修改
     *
     * @param t
     * @return
     */
    ResultSet<Integer> update(T t);

    /**
     * 查询
     *
     * @param k
     * @return
     */
    ResultSet<T> select(K k);

    /**
     * 查询
     *
     * @return
     */
    ResultSet<List<T>> select();

    /**
     * 查询
     *
     * @param page
     * @return
     */
    ResultSet<Page<T>> select(Page<T> page);


}
