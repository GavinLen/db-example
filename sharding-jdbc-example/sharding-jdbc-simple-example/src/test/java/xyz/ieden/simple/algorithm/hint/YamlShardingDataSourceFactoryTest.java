package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.api.config.rule.ShardingRuleConfiguration;
import io.shardingsphere.core.yaml.sharding.YamlShardingConfiguration;
import io.shardingsphere.core.yaml.sharding.YamlShardingRuleConfiguration;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @author gavin
 * @date 2019/4/17 0:05
 */
public class YamlShardingDataSourceFactoryTest {

    @Test
    public void testYamlFile() throws IOException {
        String dir = System.getProperty("user.dir");
        File file = new File(dir + "/src/main/resources/META-INF/sharding-tables.yaml");
        YamlShardingConfiguration config = YamlShardingConfiguration.unmarshal(file);
        Map<String, DataSource> dataSources = config.getDataSources();
        YamlShardingRuleConfiguration shardingRule = config.getShardingRule();
        ShardingRuleConfiguration shardingRuleConfiguration = shardingRule.getShardingRuleConfiguration();
        Map<String, Object> configMap = config.getConfigMap();
        Properties props = config.getProps();
        System.out.println("aa");
    }
}
