package org.javaProject.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/*
@Service annotation is used to mark a class as a Service Bean. 
It tells the Spring Framework that the class contains the business logic of your application.
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    /* 
    @Override is an annotation that tells the compiler that a method in a subclass is intended to
    replace (or provide the specific implementation for) a method that already exists in its parent class or interface.
     */
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        // Bean utils simplifies the process of moving data between two objects that have similar structures.
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        // employees.add(employee);
        return "Saved Succesfully";
    }

    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeesList = employeeRepository.findAll(); // Fetches all from DB
        List<Employee> employees = new ArrayList<>();

        for (EmployeeEntity employeeEntity : employeesList) {
            Employee emp = new Employee();
            // Use BeanUtils to copy EVERYTHING (id, name, phone, email) automatically
            BeanUtils.copyProperties(employeeEntity, emp);
            employees.add(emp);
        }

        return employees;
    }

    @Override
    public Employee readEmployee(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if (employeeEntity == null) {
            return null;
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        // 1. Check if the ID exists in MySQL
        if (employeeRepository.existsById(id)) {
            // 2. Delete it from the database
            employeeRepository.deleteById(id);
            return true;
        }
        // 3. Return false so the Controller can say "ID not found"
        return false;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if (employeeEntity != null) {
            // 1. Manually set the fields or ensure the ID isn't wiped
            employeeEntity.setName(employee.getName());
            employeeEntity.setEmail(employee.getEmail());
            employeeEntity.setPhoneNo(employee.getPhoneNo());
            
            // 2. Save will now perform an UPDATE because employeeEntity still has its ID
            employeeRepository.save(employeeEntity);
            return "Updated Successfully";
        }
        return "Employee not found";
    }
}
