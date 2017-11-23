package com.ranguisheng.blog.template;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


/**
 * Created by guishengran on 2017/11/23.
 */
@SpringBootApplication
public class ApplicationBoot extends SpringBootServletInitializer  {
    private static final Logger logger = Logger.getLogger(ApplicationBoot.class);
    public static void main(String[] args){
        SpringApplication.run(ApplicationBoot.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationBoot.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args-> {
            logger.debug("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName:beanNames){
                logger.debug(beanName);
            }
        };
    }
}
