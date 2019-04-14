package xyz.ieden.simple.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.ieden.common.entity.UserInfoEntity;
import xyz.ieden.common.util.Page;
import xyz.ieden.simple.dao.IUserInfoDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gavin
 * @date 2019/4/13 23:43
 */
public class UserInfoDaoImpl implements IUserInfoDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoDaoImpl.class);

    private static final String TABLE_NAME = "t_user_info";
    private static final String TABLE_LINE = "id, name, sex, age, create_time";

    private final DataSource dataSource;

    public UserInfoDaoImpl(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Integer insert(UserInfoEntity userInfoEntity) {
        String sqlStr = "INSERT INTO " + TABLE_NAME + " (id, name, sex, age, create_time) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlStr, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, userInfoEntity.getId());
            preparedStatement.setString(2, userInfoEntity.getName());
            preparedStatement.setBoolean(3, userInfoEntity.getSex());
            preparedStatement.setShort(4, userInfoEntity.getAge());
            preparedStatement.setDate(5, (Date) userInfoEntity.getCreateTime());

            boolean updateResult = preparedStatement.execute(sqlStr);
            LOGGER.info("UpdateResult: [].", updateResult);
            java.sql.ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()) {
                userInfoEntity.setId(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userInfoEntity.getId();
    }

    @Override
    public Boolean delete(Integer id) {
        String sqlStr = "DELETE FROM {0} WHERE id = ?";
        String sql = MessageFormat.format(sqlStr, TABLE_NAME);
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (final SQLException ignored) {
        }
        return null;
    }

    @Override
    public Boolean update(UserInfoEntity userInfoEntity) {
        return null;
    }

    @Override
    public UserInfoEntity select(Integer id) {
        String sqlStr = "SELECT {0} FROM {1} WHERE id = {2}";
        String sql = MessageFormat.format(sqlStr, TABLE_LINE, TABLE_NAME, id);
        UserInfoEntity entity = this.executeQuery(sql);
        return entity;
    }

    @Override
    public List<UserInfoEntity> select() {
        String sqlStr = "SELECT {0} FROM {1}";
        String sql = MessageFormat.format(sqlStr, TABLE_LINE, TABLE_NAME);
        List<UserInfoEntity> list = this.executeQueryList(sql);
        return list;
    }

    @Override
    public Page<UserInfoEntity> select(Page<UserInfoEntity> page) {
        return null;
    }

    /**
     * 查询
     *
     * @param sqlStr
     * @return
     */
    private UserInfoEntity executeQuery(String sqlStr) {
        UserInfoEntity entity = new UserInfoEntity();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
             java.sql.ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                entity.setId(resultSet.getInt(1));
                entity.setName(resultSet.getString(2));
                entity.setSex(resultSet.getBoolean(3));
                entity.setAge(resultSet.getShort(4));
                entity.setCreateTime(resultSet.getTimestamp(5));
            }
        } catch (final SQLException ignored) {
        }
        return entity;
    }

    /**
     * 查询 List
     *
     * @param sqlStr
     * @return
     */
    private List<UserInfoEntity> executeQueryList(String sqlStr) {
        List<UserInfoEntity> list = new LinkedList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
             java.sql.ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                UserInfoEntity entity = new UserInfoEntity();
                entity.setId(resultSet.getInt(1));
                entity.setName(resultSet.getString(2));
                entity.setSex(resultSet.getBoolean(3));
                entity.setAge(resultSet.getShort(4));
                entity.setCreateTime(resultSet.getTimestamp(5));
                list.add(entity);
            }
        } catch (final SQLException ignored) {
        }
        return list;
    }
}
