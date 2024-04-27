package com.example.scaffoldserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class ScaffoldServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldServerApplication.class, args);
    }

}
