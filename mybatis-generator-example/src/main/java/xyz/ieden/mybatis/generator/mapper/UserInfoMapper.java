package xyz.ieden.mybatis.generator.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static xyz.ieden.mybatis.generator.mapper.UserInfoDynamicSqlSupport.*;

import java.time.LocalDate;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import xyz.ieden.mybatis.generator.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.392+08:00", comments="Source Table: t_user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.394+08:00", comments="Source Table: t_user_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.394+08:00", comments="Source Table: t_user_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.395+08:00", comments="Source Table: t_user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sex", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="age", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="create_time", javaType=LocalDate.class, jdbcType=JdbcType.DATE)
    })
    UserInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.397+08:00", comments="Source Table: t_user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sex", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="age", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="create_time", javaType=LocalDate.class, jdbcType=JdbcType.DATE)
    })
    List<UserInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.399+08:00", comments="Source Table: t_user_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.399+08:00", comments="Source Table: t_user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.4+08:00", comments="Source Table: t_user_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.402+08:00", comments="Source Table: t_user_info")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.403+08:00", comments="Source Table: t_user_info")
    default int insert(UserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userInfo)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(sex).toProperty("sex")
                .map(age).toProperty("age")
                .map(createTime).toProperty("createTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.405+08:00", comments="Source Table: t_user_info")
    default int insertSelective(UserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(age).toPropertyWhenPresent("age", record::getAge)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.406+08:00", comments="Source Table: t_user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, sex, age, createTime)
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.407+08:00", comments="Source Table: t_user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, sex, age, createTime)
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.408+08:00", comments="Source Table: t_user_info")
    default UserInfo selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, sex, age, createTime)
                .from(userInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.409+08:00", comments="Source Table: t_user_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(sex).equalTo(record::getSex)
                .set(age).equalTo(record::getAge)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.41+08:00", comments="Source Table: t_user_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(age).equalToWhenPresent(record::getAge)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.411+08:00", comments="Source Table: t_user_info")
    default int updateByPrimaryKey(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(name).equalTo(record::getName)
                .set(sex).equalTo(record::getSex)
                .set(age).equalTo(record::getAge)
                .set(createTime).equalTo(record::getCreateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.412+08:00", comments="Source Table: t_user_info")
    default int updateByPrimaryKeySelective(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(name).equalToWhenPresent(record::getName)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(age).equalToWhenPresent(record::getAge)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}