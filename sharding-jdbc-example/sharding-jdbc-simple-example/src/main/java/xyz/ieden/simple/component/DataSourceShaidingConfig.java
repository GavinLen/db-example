package xyz.ieden.simple.component;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据源组件
 *
 * @author gavin
 * @date 2019/4/14 8:27
 */
public interface DataSourceShaidingConfig {
    /**
     * 获取数据源
     *
     * @return
     * @throws SQLException
     */
    DataSource getDataSource() throws SQLException;
}
