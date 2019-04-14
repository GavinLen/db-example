package xyz.ieden.simple.algorithm.precise;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * 表精确分区算法
 *
 * @author gavin
 * @date 2019/4/14 10:49
 */
public class TablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TablePreciseShardingAlgorithm.class);

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(shardingValue.getValue() % 2 + "")) {
                LOGGER.info("shardingValue: [{}], tableName:[{}].", shardingValue.getValue(), tableName);
                return tableName;
            }
        }
        throw new UnsupportedOperationException();
    }
}
