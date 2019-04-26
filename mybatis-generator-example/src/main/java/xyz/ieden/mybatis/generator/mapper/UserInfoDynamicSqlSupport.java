package xyz.ieden.mybatis.generator.mapper;

import java.sql.JDBCType;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.389+08:00", comments="Source Table: t_user_info")
    public static final UserInfo userInfo = new UserInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.389+08:00", comments="Source field: t_user_info.id")
    public static final SqlColumn<Long> id = userInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.39+08:00", comments="Source field: t_user_info.name")
    public static final SqlColumn<String> name = userInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.39+08:00", comments="Source field: t_user_info.sex")
    public static final SqlColumn<Boolean> sex = userInfo.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.391+08:00", comments="Source field: t_user_info.age")
    public static final SqlColumn<Byte> age = userInfo.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.391+08:00", comments="Source field: t_user_info.create_time")
    public static final SqlColumn<LocalDate> createTime = userInfo.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.389+08:00", comments="Source Table: t_user_info")
    public static final class UserInfo extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> sex = column("sex", JDBCType.BIT);

        public final SqlColumn<Byte> age = column("age", JDBCType.TINYINT);

        public final SqlColumn<LocalDate> createTime = column("create_time", JDBCType.DATE);

        public UserInfo() {
            super("t_user_info");
        }
    }
}