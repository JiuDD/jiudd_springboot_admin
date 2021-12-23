package com.jiudd.find.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class FindAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindAdminServerApplication.class, args);
    }

}
