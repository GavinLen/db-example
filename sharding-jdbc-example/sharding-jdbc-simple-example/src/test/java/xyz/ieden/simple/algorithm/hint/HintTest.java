package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.api.HintManager;
import org.junit.BeforeClass;
import org.junit.Test;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.config.hint.TableHintShardingConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author gavin
 * @date 2019/4/17 1:54
 */
public class HintTest {

    private static DataSource dataSource = null;

    @BeforeClass
    public static void getDatasource() throws SQLException {
        DataSourceShaidingConfig config = new TableHintShardingConfig();
        dataSource = config.getDataSource();
    }

    @Test
    public void test() throws SQLException {
        HintManager hintManager = HintManager.getInstance();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

    }

}
