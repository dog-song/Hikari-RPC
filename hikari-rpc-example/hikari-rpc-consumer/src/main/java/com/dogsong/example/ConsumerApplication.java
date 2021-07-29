package com.dogsong.example;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO
 *
 * @author <a href="mailto:domi.song@yunzhihui.com">domisong</a>
 * @since 2021/7/29
 */
@SpringBootApplication
@ImportResource({"classpath:spring-config.xml"})
public class ConsumerApplication {

    public static void main(String[] args) {
        // ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        // classPathXmlApplicationContext.start();
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
