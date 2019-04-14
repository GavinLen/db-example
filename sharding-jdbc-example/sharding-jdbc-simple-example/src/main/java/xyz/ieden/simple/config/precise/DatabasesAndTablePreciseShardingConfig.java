package xyz.ieden.simple.config.precise;

import xyz.ieden.simple.component.DataSourceShaidingConfig;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据库与表精准分片配置
 *
 * @author gavin
 * @date 2019/4/14 16:26
 */
public class DatabasesAndTablePreciseShardingConfig implements DataSourceShaidingConfig {
    @Override
    public DataSource getDataSource() throws SQLException {
        return null;
    }
}
