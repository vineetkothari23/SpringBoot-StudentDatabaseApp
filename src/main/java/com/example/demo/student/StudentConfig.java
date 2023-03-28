package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vineet = new Student(
                    "Vineet",
                    LocalDate.of(1996, DECEMBER, 23),
                    "vineetkothari23@gmail.com"
            );
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1996, DECEMBER, 23),
                    "vineetkothari23@gmail.com"
            );
            Student sarah = new Student(
                    "Sarah",
                    LocalDate.of(1996, DECEMBER, 28),
                    "vineetkothari23@gmail.com"
            );
            repository.saveAll(
                    List.of(vineet, alex, sarah)
            );
        };
    }
}
