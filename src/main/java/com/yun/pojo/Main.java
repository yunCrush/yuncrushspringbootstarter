package com.yun.pojo;

import com.yun.config.MyAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * Author: yunCrush
 * Date:2022-11-14 22:04
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAutoConfiguration.class);
        String[] names= applicationContext.getBeanDefinitionNames();
        for ( String name : names) {
            System.out.println("beanName: "+name+"  " + "val: " + applicationContext.getBean(name));
        }
    }
}
