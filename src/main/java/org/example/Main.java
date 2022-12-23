package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}