package xyz.ieden.simple.algorithm.hint;

import io.shardingsphere.api.algorithm.sharding.ListShardingValue;
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
        availableTargetNames.forEach(each -> {
            ListShardingValue<Integer> tmpSharding = (ListShardingValue<Integer>) shardingValue;
            tmpSharding.getValues().forEach(value -> {
                Integer tableSuffix = getTableSuffix(value);
                if (each.endsWith(tableSuffix.toString())) {
                    result.add(each);
                }
            });
        });
        return result;
    }

    private Integer getTableSuffix(Integer value) {
        return value % 2;
    }
}
