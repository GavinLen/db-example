package xyz.ieden.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gavin
 * @date 2019/4/14 13:32
 */
@Data
public class UserInfoEntity implements Serializable {

    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 年龄
     */
    private Short age;

    /**
     * 创建时间
     */
    private Date createTime;
}
