package xyz.ieden.simple.component;

/**
 * 数据源常量类
 *
 * @author gavin
 * @date 2019/4/14 8:38
 */
public interface DataSourceConstant {

    String DRIVER = "com.mysql.jdbc.Driver";

    // Master DataSource
    /**
     * MASTER_URL
     */
    String MASTER_URL = "jdbc:mysql://localhost:3306/db_master?useUnicode=true&useSSL=false&characterEncoding=utf8";
    /**
     * MASTER_USERNAME
     */
    String MASTER_USERNAME = "root";
    /**
     * MASTER_PASSWORD
     */
    String MASTER_PASSWORD = "Root4510@";

    // SlaveOne DataSource
    /**
     * SLAVE_ONE_URL
     */
    String SLAVE_ONE_URL = "jdbc:mysql://localhost:3306/db_slave_one?useUnicode=true&useSSL=false&characterEncoding=utf8";
    /**
     * SLAVE_ONE_USERNAME
     */
    String SLAVE_ONE_USERNAME = "root";
    /**
     * SLAVE_ONE_PASSWORD
     */
    String SLAVE_ONE_PASSWORD = "Root4510@";

    // SlaveTwo DataSource
    /**
     * SLAVE_TWO_URL
     */
    String SLAVE_TWO_URL = "jdbc:mysql://localhost:3306/db_slave_two?useUnicode=true&useSSL=false&characterEncoding=utf8";
    /**
     * SLAVE_TWO_USERNAME
     */
    String SLAVE_TWO_USERNAME = "root";
    /**
     * SLAVE_TWO_PASSWORD
     */
    String SLAVE_TWO_PASSWORD = "Root4510@";
}
