package org.javaProject.em_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "emp_db")
public class EmployeeEntity {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // To generate id
    private Long id;
    private String name;
    private String phoneNo;
    private String email;
}