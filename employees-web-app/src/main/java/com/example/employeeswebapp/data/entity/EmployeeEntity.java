package com.example.employeeswebapp.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="EMPLOYEES")
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //“Automatically generate a UUID value for this field when saving a new entity”
    @Column(name ="EMPLOYEE_ID")
    private UUID employeeId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    private String position;

    @Override
    public String toString(){
        return "Employee Entity{" +
                "employeeId=" + employeeId +
                ", firsName='"+ firstName + '\''+
                ", lastName="+ lastName+  '\'' +
                ", position="+ position + '\'' +
                '}';
    }
}
