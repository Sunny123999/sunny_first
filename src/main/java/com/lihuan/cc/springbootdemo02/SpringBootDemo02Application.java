package com.lihuan.cc.springbootdemo02;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAdminServer
public class SpringBootDemo02Application {

    public static class AdminclientApplication {
        public static void main(String[] args) {
            SpringApplication.run(AdminclientApplication.class, args);
        }


    }
}


