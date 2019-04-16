package xyz.ieden.simple.config.complex;

import io.shardingsphere.api.config.rule.MasterSlaveRuleConfiguration;
import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import xyz.ieden.simple.component.DataSourceShaidingConfig;
import xyz.ieden.simple.util.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author gavin
 * @date 2019/4/14 9:23
 */
public class MasterSlaveConfig implements DataSourceShaidingConfig {
    @Override
    public DataSource getDataSource() throws SQLException {
        MasterSlaveRuleConfiguration ruleConfiguration = new MasterSlaveRuleConfiguration();
        ruleConfiguration.setName("rule_master_slave");
        ruleConfiguration.setMasterDataSourceName("master");
        ruleConfiguration.setSlaveDataSourceNames(Arrays.asList("slaveOne", "slaveTwo"));
        return MasterSlaveDataSourceFactory.createDataSource(DataSourceUtils.getAllDataSource(), ruleConfiguration, new ConcurrentHashMap<String, Object>(), new Properties());
    }
}
