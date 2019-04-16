package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.hint.HintShardingAlgorithm;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author gavin
 * @date 2019/4/16 23:24
 */
public class TableHintShardingAlgorithm implements HintShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, ShardingValue shardingValue) {
        Collection<String> result = new ArrayList<>();
        for (String str : availableTargetNames) {
            String columnName = shardingValue.getColumnName();
            String logicTableName = shardingValue.getLogicTableName();
        }
        return null;
    }
}
