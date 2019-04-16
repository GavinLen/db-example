package xyz.ieden.simple.algorithm.precise;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.ieden.common.entity.BookEntity;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.config.precise.TablePreciseShardingConfig;
import xyz.ieden.simple.dao.IBookDao;
import xyz.ieden.simple.dao.impl.BookDaoImpl;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class BookDaoImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookDaoImplTest.class);

    private static IBookDao bookDao;

    @BeforeClass
    public static void getBookDao() throws SQLException {
        DataSourceShaidingConfig config = new TablePreciseShardingConfig();
        DataSource dataSource = config.getDataSource();
        bookDao = new BookDaoImpl(dataSource);
    }

    @Test
    public void insert() {
        for (int i = 20; i < 50; i++) {
            BookEntity entity = new BookEntity();
            Integer id = i;
            entity.setId(id);
            entity.setBookName("Test_" + id);
            entity.setBookAuthor("Author_" + id);
            entity.setBookType(1);
            entity.setBookPrice(11F);
            entity.setIsbn("978-7-302-42328-" + id);
            entity.setCreateDate(new Date());
            Integer result = bookDao.insert(entity);
            Assert.assertEquals(result, id);
            LOGGER.info("Result:[{}].", result);
        }
    }

    @Test
    public void delete() {
        Boolean result = bookDao.delete(48);
        Assert.assertTrue(result);
    }

    @Test
    public void update() {
        BookEntity entity = bookDao.select(20);
        entity.setBookName("Update_Name");
        Boolean updateResult = bookDao.update(entity);
        Assert.assertTrue(updateResult);
        LOGGER.info("Result:[{}].", updateResult);
    }

    @Test
    public void selectById() {
        BookEntity entity = bookDao.select(1);
        Assert.assertNotNull(entity);
        LOGGER.info(entity.toString());
    }

    @Test
    public void select() {
        List<BookEntity> list = bookDao.select();
        Assert.assertNotNull(list);
        LOGGER.info("Size:[{}].", list.size());
    }


}