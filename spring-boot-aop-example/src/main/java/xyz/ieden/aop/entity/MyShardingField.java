package xyz.ieden.aop.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import xyz.ieden.aop.annotation.HintSharding;

/**
 * @author lianghongwei01
 * @date 2019/4/25 17:28
 */
@HintSharding
public class MyShardingField {
    private Integer cityId;
    private String bookName;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
