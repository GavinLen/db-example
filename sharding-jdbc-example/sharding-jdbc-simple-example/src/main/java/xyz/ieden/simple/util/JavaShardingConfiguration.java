package xyz.ieden.simple.util;

import io.shardingsphere.api.config.rule.ShardingRuleConfiguration;
import lombok.Getter;
import lombok.Setter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gavin
 * @date 2019/4/17 1:35
 */
@Setter
@Getter
public class JavaShardingConfiguration {

    private Map<String, DataSource> dataSourceMap = new HashMap<>();
    private ShardingRuleConfiguration configuration;
    private Map<String, Object> configMap = new LinkedHashMap<>();
    private Properties props = new Properties();

}
