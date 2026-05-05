package com.example.employeeswebapp;

import com.example.employeeswebapp.data.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeesWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesWebAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository){
        return args -> {
            employeeRepository.findAll().forEach(System.out::println);
        };
    }
}
