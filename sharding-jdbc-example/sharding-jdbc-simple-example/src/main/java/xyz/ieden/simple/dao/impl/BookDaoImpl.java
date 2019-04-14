package xyz.ieden.simple.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.ieden.common.entity.BookEntity;
import xyz.ieden.common.util.Page;
import xyz.ieden.simple.dao.IBookDao;

import javax.sql.DataSource;
import java.sql.*;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gavin
 * @date 2019/4/14 13:42
 */
public class BookDaoImpl implements IBookDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoDaoImpl.class);

    private static final String TABLE_NAME = "t_book";
    private static final String TABLE_LINE = "id, book_name, book_author, book_type, book_price, isbn, create_date";

    private final DataSource dataSource;

    public BookDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public Integer insert(BookEntity bookEntity) {
        String sqlStr = "INSERT INTO {0} ({1}) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sql = MessageFormat.format(sqlStr, TABLE_NAME, TABLE_LINE);
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, bookEntity.getId());
            preparedStatement.setString(2, bookEntity.getBookName());
            preparedStatement.setString(3, bookEntity.getBookAuthor());
            preparedStatement.setInt(4, bookEntity.getBookType());
            preparedStatement.setFloat(5, bookEntity.getBookPrice());
            preparedStatement.setString(6, bookEntity.getIsbn());
            long time = bookEntity.getCreateDate().getTime();
            preparedStatement.setDate(7, new Date(time));

            int updateResult = preparedStatement.executeUpdate();
            LOGGER.info("UpdateResult: [{}].", updateResult);
            java.sql.ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                bookEntity.setId(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookEntity.getId();
    }

    @Override
    public Boolean delete(Integer id) {
        String sqlStr = "DELETE FROM {0} WHERE id = ?";
        String sql = MessageFormat.format(sqlStr, TABLE_NAME);
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int delResult = preparedStatement.executeUpdate();
            LOGGER.info("DeleteResult:[{}].", delResult);
            if (delResult > 0) {
                return Boolean.TRUE;
            }
        } catch (final SQLException ignored) {
        }
        return Boolean.FALSE;
    }

    @Override
    public Boolean update(BookEntity bookEntity) {
        String sqlStr = "UPDATE {0} SET book_name = ?, book_author = ?, book_type = ?, book_price = ?, isbn = ?, create_date = ? WHERE id = ?";
        String sql = MessageFormat.format(sqlStr, TABLE_NAME);
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bookEntity.getBookName());
            preparedStatement.setString(2, bookEntity.getBookAuthor());
            preparedStatement.setInt(3, bookEntity.getBookType());
            preparedStatement.setFloat(4, bookEntity.getBookPrice());
            preparedStatement.setString(5, bookEntity.getIsbn());
            long time = bookEntity.getCreateDate().getTime();
            preparedStatement.setDate(6, new Date(time));
            preparedStatement.setInt(7, bookEntity.getId());
            int delResult = preparedStatement.executeUpdate();
            LOGGER.info("DeleteResult:[{}].", delResult);
            if (delResult > 0) {
                return Boolean.TRUE;
            }
        } catch (final SQLException ignored) {
        }
        return Boolean.FALSE;
    }

    @Override
    public BookEntity select(Integer id) {
        String sqlStr = "SELECT {0} FROM {1} WHERE id = {2}";
        String sql = MessageFormat.format(sqlStr, TABLE_LINE, TABLE_NAME, id);
        BookEntity entity = this.executeQuery(sql);
        return entity;
    }

    @Override
    public List<BookEntity> select() {
        String sqlStr = "SELECT {0} FROM {1}";
        String sql = MessageFormat.format(sqlStr, TABLE_LINE, TABLE_NAME);
        List<BookEntity> list = this.executeQueryList(sql);
        return list;
    }

    @Override
    public Page<BookEntity> select(Page<BookEntity> page) {
        return null;
    }

    /**
     * 查询
     *
     * @param sqlStr
     * @return
     */
    private BookEntity executeQuery(String sqlStr) {
        BookEntity entity = new BookEntity();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
             java.sql.ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                entity.setId(resultSet.getInt(1));
                entity.setBookName(resultSet.getString(2));
                entity.setBookAuthor(resultSet.getString(3));
                entity.setBookType(resultSet.getInt(4));
                entity.setBookPrice(resultSet.getFloat(5));
                entity.setIsbn(resultSet.getString(6));
                entity.setCreateDate(resultSet.getTimestamp(7));
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
    private List<BookEntity> executeQueryList(String sqlStr) {
        List<BookEntity> list = new LinkedList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
             java.sql.ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                BookEntity entity = new BookEntity();
                entity.setId(resultSet.getInt(1));
                entity.setBookName(resultSet.getString(2));
                entity.setBookAuthor(resultSet.getString(3));
                entity.setBookType(resultSet.getInt(4));
                entity.setBookPrice(resultSet.getFloat(5));
                entity.setIsbn(resultSet.getString(6));
                entity.setCreateDate(resultSet.getTimestamp(7));
                list.add(entity);
            }
        } catch (final SQLException ignored) {
        }
        return list;
    }
}
