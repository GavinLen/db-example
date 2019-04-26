package xyz.ieden.aop.annotation;

import java.lang.annotation.*;

/**
 * @author
 * @date
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HintSharding {
    /**
     * 分区字段名称
     *
     * @return
     */
    String fieldName() default "cityId";
}
