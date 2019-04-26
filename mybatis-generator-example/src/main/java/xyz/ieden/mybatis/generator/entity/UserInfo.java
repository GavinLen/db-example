package xyz.ieden.mybatis.generator.entity;

import java.time.LocalDate;
import javax.annotation.Generated;

public class UserInfo extends RootClass {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.38+08:00", comments="Source field: t_user_info.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.381+08:00", comments="Source field: t_user_info.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.sex")
    private Boolean sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.age")
    private Byte age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.create_time")
    private LocalDate createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.373+08:00", comments="Source Table: t_user_info")
    public UserInfo(Long id, String name, Boolean sex, Byte age, LocalDate createTime) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.378+08:00", comments="Source Table: t_user_info")
    public UserInfo() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.381+08:00", comments="Source field: t_user_info.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.381+08:00", comments="Source field: t_user_info.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.sex")
    public Boolean getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.sex")
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.age")
    public Byte getAge() {
        return age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.382+08:00", comments="Source field: t_user_info.age")
    public void setAge(Byte age) {
        this.age = age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.383+08:00", comments="Source field: t_user_info.create_time")
    public LocalDate getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-04-24T15:04:22.383+08:00", comments="Source field: t_user_info.create_time")
    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
}