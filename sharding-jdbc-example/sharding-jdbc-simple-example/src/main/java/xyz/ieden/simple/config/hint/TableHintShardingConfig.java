package xyz.ieden.simple.config.hint;

import io.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.util.JavaShardingConfiguration;
import xyz.ieden.simple.util.JavaShardingConfigurationUtils;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author gavin
 * @date 2019/4/16 23:32
 */
public class TableHintShardingConfig implements DataSourceShaidingConfig {
    @Override
    public DataSource getDataSource() throws SQLException {
        JavaShardingConfiguration configuration = JavaShardingConfigurationUtils.getJavaShardingConfiguration();
        return ShardingDataSourceFactory.createDataSource(configuration.getDataSourceMap(), configuration.getConfiguration(), configuration.getConfigMap(), configuration.getProps());
    }




}
