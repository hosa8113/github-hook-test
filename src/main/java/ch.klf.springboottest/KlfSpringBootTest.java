package ch.klf.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KlfSpringBootTest {

    public static void main(String[] args) {
        System.out.println("Here we go!");
        SpringApplication.run(KlfSpringBootTest.class, args);
    }
}