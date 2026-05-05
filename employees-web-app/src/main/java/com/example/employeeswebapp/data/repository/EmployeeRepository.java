package com.example.employeeswebapp.data.repository;

import com.example.employeeswebapp.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID> {
}
