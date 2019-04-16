package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.core.yaml.sharding.YamlShardingConfiguration;
import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author gavin
 * @date 2019/4/17 0:05
 */
public class YamlShardingDataSourceFactoryTest {
    public static void main(String[] args) throws IOException {
        File file = new File(YamlShardingDataSourceFactoryTest.class.getResource("/META-INF/sharding-tables.yaml").getFile());
        YamlShardingConfiguration config = YamlShardingConfiguration.unmarshal(file);
    }
    public void main() throws IOException, SQLException {
//        String dir = System.getProperty("user.dir");
//        File file = new File(dir + "/src/main/resources/META-INF/sharding-tables.yaml");
        File file = new File(YamlShardingDataSourceFactoryTest.class.getResource("/META-INF/sharding-tables.yaml").getFile());
        YamlShardingConfiguration config = YamlShardingConfiguration.unmarshal(file);
        Assert.assertNotNull(config);
    }
}
