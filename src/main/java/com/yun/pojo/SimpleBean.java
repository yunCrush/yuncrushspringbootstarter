package com.yun.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author: yunCrush
 * Date:2022/4/13 20:50
 * Description:
 */
// 开启下面的注解@ConfigurationProperties
@EnableConfigurationProperties(SimpleBean.class)
// 配置文件中simplebean开头的属性注入到以下属性
@ConfigurationProperties(prefix = "simplebean")
@Data
public class SimpleBean {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "SimpleBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
