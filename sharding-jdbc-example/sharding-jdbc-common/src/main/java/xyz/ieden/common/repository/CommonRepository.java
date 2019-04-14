package xyz.ieden.common.repository;

import xyz.ieden.common.util.Page;
import xyz.ieden.common.util.ResultSet;

import java.util.List;

/**
 * 公共 Repository
 *
 * @author gavin
 * @date 2019/4/13 23:09
 */
public interface CommonRepository<T, K> {

    /**
     * 添加
     *
     * @param t
     * @return
     */
    K insert(T t);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    Boolean delete(K id);

    /**
     * 修改
     *
     * @param t
     * @return
     */
    Boolean update(T t);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    T select(K id);

    /**
     * 查询
     *
     * @return
     */
    List<T> select();

    /**
     * 查询
     *
     * @param page
     * @return
     */
    Page<T> select(Page<T> page);

}
