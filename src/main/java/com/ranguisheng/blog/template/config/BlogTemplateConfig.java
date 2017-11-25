package com.ranguisheng.blog.template.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by guishengran on 2017/11/24.
 */
@ConfigurationProperties(prefix = "web")
@PropertySource("classpath:my-web.properties")
@Component
public class BlogTemplateConfig {
    private String name;
    private String version;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
