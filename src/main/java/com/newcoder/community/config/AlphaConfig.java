package com.newcoder.community.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.text.SimpleDateFormat;


/**
 * @ClassName AlphaConfig
 * @Description TODO
 * @Author bill
 * @Date 2021/8/17 17:12
 * @Version 1.0
 **/
@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
    }


}
