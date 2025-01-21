package com.example.myapp;

import com.example.myapp.entity.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = MySpringBootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MySpringBootApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testHelloEndpoint() {
        ResponseEntity<Hello> response = restTemplate.getForEntity("/hello", Hello.class);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getName()).isEqualTo("World");
        assertThat(response.getBody().getMessage()).isEqualTo("Hello, World!");
    }

}