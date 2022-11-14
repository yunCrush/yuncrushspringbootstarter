package com.yun.config;

import com.yun.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Author: yunCrush
 * Date:2022/4/13 20:56
 * Description:
 */
@Configuration
/**
 *类路径下存在指定的类时，就会进行自动配置
 * @ConditionalOnClass(SimpleBean.class)
 */
@ConditionalOnClass(SimpleBean.class)
public class MyAutoConfiguration {
    static {
        System.out.println("MyAutoConfiguration init .....");
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
