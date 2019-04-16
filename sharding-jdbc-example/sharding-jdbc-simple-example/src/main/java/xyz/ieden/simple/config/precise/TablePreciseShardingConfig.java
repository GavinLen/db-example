package xyz.ieden.simple.config.precise;

import io.shardingsphere.api.config.rule.ShardingRuleConfiguration;
import io.shardingsphere.api.config.rule.TableRuleConfiguration;
import io.shardingsphere.api.config.strategy.StandardShardingStrategyConfiguration;
import io.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import xyz.ieden.simple.algorithm.precise.TablePreciseShardingAlgorithm;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.util.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 表精准分片配置
 *
 * @author gavin
 * @date 2019/4/14 10:05
 */
public class TablePreciseShardingConfig implements DataSourceShaidingConfig {
    @Override
    public DataSource getDataSource() throws SQLException {

        ShardingRuleConfiguration configuration = new ShardingRuleConfiguration();
        // 表规则配置
        configuration.getTableRuleConfigs().add(getUserInfoTableRuleConfig());
        configuration.getBindingTableGroups().add("t_book");
        configuration.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("id", new TablePreciseShardingAlgorithm()));

        // Properties
        Properties properties = new Properties();
        properties.put("sql.show", true);
        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), configuration, new HashMap<>(), properties);
    }

    /**
     * 表规则配置
     *
     * @return
     */
    private static TableRuleConfiguration getUserInfoTableRuleConfig() {
        TableRuleConfiguration configuration = new TableRuleConfiguration();
        // 设置逻辑表
        configuration.setLogicTable("t_book");
        // 设置实际表
        configuration.setActualDataNodes("db_master.t_book_${[0,1]}");
        configuration.setKeyGeneratorColumnName("id");
        return configuration;
    }

    /**
     * 创建数据源映射
     *
     * @return
     */
    protected static Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> dataSourceMap = new HashMap<>(1);
        dataSourceMap.put("db_master", DataSourceUtils.getDataSourceByName("master"));
        return dataSourceMap;
    }
}
