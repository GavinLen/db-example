package xyz.ieden.simple.util;

import com.alibaba.druid.pool.DruidDataSource;
import xyz.ieden.simple.component.DataSourceConstant;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据源工具类
 *
 * @author gavin
 * @date 2019/4/14 9:36
 */
public class DataSourceUtils {

    private static Map<String, DataSource> allDataSourceMap;

    /**
     * 通过 name 获取数据源
     *
     * @param name
     * @return
     */
    public static DataSource getDataSourceByName(String name) {
        Map<String, DataSource> dataSourceMap = getAllDataSource();
        DataSource dataSource = dataSourceMap.get(name);
        return dataSource;
    }

    /**
     * 获取所有数据源
     *
     * @return
     */
    public static Map<String, DataSource> getAllDataSource() {
        if (allDataSourceMap == null || allDataSourceMap.isEmpty()) {
            synchronized (Map.class) {
                if (allDataSourceMap == null || allDataSourceMap.isEmpty()) {
                    allDataSourceMap = new HashMap<>(3);
                    allDataSourceMap.put("master", createDataSource(DataSourceConstant.MASTER_URL, DataSourceConstant.MASTER_USERNAME, DataSourceConstant.MASTER_PASSWORD));
                    allDataSourceMap.put("slaveOne", createDataSource(DataSourceConstant.SLAVE_ONE_URL, DataSourceConstant.SLAVE_ONE_USERNAME, DataSourceConstant.SLAVE_ONE_PASSWORD));
                    allDataSourceMap.put("slaveTwo", createDataSource(DataSourceConstant.SLAVE_TWO_URL, DataSourceConstant.SLAVE_TWO_USERNAME, DataSourceConstant.SLAVE_TWO_PASSWORD));
                }
            }
        }
        return allDataSourceMap;
    }

    /**
     * 创建数据源
     *
     * @param url
     * @param username
     * @param password
     * @return
     */
    private static DataSource createDataSource(String url, String username, String password) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(DataSourceConstant.DRIVER);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
