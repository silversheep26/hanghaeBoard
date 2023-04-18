package com.sparta.hanghaeboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HanghaeBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanghaeBoardApplication.class, args);
    }

}
