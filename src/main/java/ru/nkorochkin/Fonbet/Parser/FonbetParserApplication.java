package ru.nkorochkin.Fonbet.Parser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.URI;

@SpringBootApplication
@EnableScheduling
public class FonbetParserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FonbetParserApplication.class, args);
    }
}
