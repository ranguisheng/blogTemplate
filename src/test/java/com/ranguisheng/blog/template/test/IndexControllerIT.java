package com.ranguisheng.blog.template.test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

/**
 * Created by guishengran on 2017/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerIT {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp()throws Exception{
        this.base = new URL("http://localhost:" + port + "/");
    }
    @Test
    public void getIndex()throws Exception{
        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
        assertThat(response.getBody(),equalTo("Welcome to blog template:)"));
    }
}
