package org.mosbach.dhbw.webservices.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.mosbach.dhbw.webservices.chatbot")
public class Main {
    public static void main(String[] args) {
        System.setProperty("https.protocols", "TLSv1.2,TLSv1.1,TLSv1");
        SpringApplication.run(Main.class, args);
    }
}
