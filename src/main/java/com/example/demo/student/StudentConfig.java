package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
//            Student rajendran = new Student(
//                    "Rajendran",
//                    "rajendran@am.students.amrita.edu",
//                    LocalDate.of(1997, OCTOBER, 3)
//            );
//            Student manoj = new Student(
//                    "Manoj",
//                    "manoj@am.students.amrita.edu",
//                    LocalDate.of(1997, OCTOBER, 6)
//            );
//
//            repository.saveAll(Arrays.asList(rajendran, manoj));
        };
    }

}
