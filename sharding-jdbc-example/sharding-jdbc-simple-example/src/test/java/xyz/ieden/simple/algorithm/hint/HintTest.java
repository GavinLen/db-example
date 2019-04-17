package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.api.HintManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.ieden.common.entity.BookEntity;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.config.hint.TableHintShardingConfig;
import xyz.ieden.simple.dao.IBookDao;
import xyz.ieden.simple.dao.impl.BookDaoImpl;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author gavin
 * @date 2019/4/17 1:54
 */
public class HintTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HintTest.class);

    private static IBookDao bookDao;

    @BeforeClass
    public static void getDatasource() throws SQLException {
        DataSourceShaidingConfig config = new TableHintShardingConfig();
        DataSource dataSource = config.getDataSource();
        bookDao = new BookDaoImpl(dataSource);
    }

    @Test
    public void test() throws SQLException {
        HintManager hintManager = HintManager.getInstance();
        hintManager.addDatabaseShardingValue("t_book", 1);
        hintManager.addTableShardingValue("t_book", 0);
        BookEntity bookEntity = bookDao.select(12);
        Assert.assertNotNull(bookEntity);
        LOGGER.info(bookEntity.toString());
        hintManager.close();
    }

}
