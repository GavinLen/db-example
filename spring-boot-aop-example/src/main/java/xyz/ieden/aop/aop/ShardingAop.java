package xyz.ieden.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author lianghongwei01
 * @date 2019/4/25 17:32
 */
@Component
@Aspect
public class ShardingAop {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShardingAop.class);

    @Before("execution(* xyz.ieden.aop.service.impl.*Impl.*(..)) && @args(xyz.ieden.aop.annotation.HintSharding)))")
    public String around(JoinPoint joinPoint) {
        LOGGER.info("执行之前处理, Date:[{}].", System.currentTimeMillis());
        try {
            Object proceed = joinPoint.getArgs();
            LOGGER.info("执行之后处理, Date:[{}].", System.currentTimeMillis());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            LOGGER.info("执行出异常处理, Date:[{}].", System.currentTimeMillis());
        } finally {
            LOGGER.info("执行始终处理, Date:[{}].", System.currentTimeMillis());
        }
        return "";
    }

}
