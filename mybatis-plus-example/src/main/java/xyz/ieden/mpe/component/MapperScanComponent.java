package xyz.ieden.mpe.component;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author gavin
 * @date 2019/4/1 23:41
 */
@Component
public class MapperScanComponent {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("xyz.ieden.mpe.mapper");
        return mapperScannerConfigurer;
    }
}
