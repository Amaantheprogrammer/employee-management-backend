package org.javaProject.em_project;

import java.util.List;

public interface EmployeeService {
    
    String createEmployee(Employee employee); // post
    List<Employee> readEmployees(); // get
    Employee readEmployee(Long id); // get by id
    boolean deleteEmployee(Long id); // delete
    String updateEmployee(Long id, Employee employee); // put

}