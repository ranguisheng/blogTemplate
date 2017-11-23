package com.ranguisheng.blog.template;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;


/**
 * Created by guishengran on 2017/11/23.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ApplicationBoot /*extends SpringBootServletInitializer*/ implements EmbeddedServletContainerCustomizer {
    private static final Logger logger = Logger.getLogger(ApplicationBoot.class);
    public static void main(String[] args) throws IOException {
        //程序启动入口
        SpringApplication.run(ApplicationBoot.class,args);
//        Properties properties = new Properties();
//        InputStream in = ApplicationBoot.class.getClassLoader().
//                getResourceAsStream("jdbc.properties");
//        properties.load(in);
//        SpringApplication app = new SpringApplication(ApplicationBoot.class);
//        app.setDefaultProperties(properties);
//        app.run(args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8081);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ApplicationBoot.class);
//    }

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
