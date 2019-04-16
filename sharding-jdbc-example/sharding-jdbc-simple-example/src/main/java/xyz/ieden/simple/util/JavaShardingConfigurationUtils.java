package xyz.ieden.simple.util;

import io.shardingsphere.api.config.rule.ShardingRuleConfiguration;
import io.shardingsphere.api.config.rule.TableRuleConfiguration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gavin
 * @date 2019/4/17 1:39
 */
public class JavaShardingConfigurationUtils {

    public static JavaShardingConfiguration getJavaShardingConfiguration() {
        JavaShardingConfiguration configuration = new JavaShardingConfiguration();
        configuration.setDataSourceMap(createDataSourceMap());
        configuration.setConfiguration(getRuleConfiguration());
        configuration.setConfigMap(getConfMap());
        configuration.setProps(getProps());

        return configuration;
    }

    private static Properties getProps() {
        Properties props = new Properties();
        props.put("sql.show", true);
        return props;
    }

    private static Map<String, Object> getConfMap() {
        Map<String, Object> configMap = new LinkedHashMap<>();
        return configMap;
    }

    private static ShardingRuleConfiguration getRuleConfiguration() {
        ShardingRuleConfiguration ruleConfiguration = new ShardingRuleConfiguration();
        // 表规则配置
        ruleConfiguration.getTableRuleConfigs().add(getUserInfoTableRuleConfig());
        ruleConfiguration.getBindingTableGroups().add("t_book");
        return ruleConfiguration;
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
