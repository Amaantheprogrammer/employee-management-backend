/* 
Because of this interface, you can now call these methods in your EmployeeServiceImpl:

save(entity): Inserts a new row or updates an existing one in MySQL.

findAll(): Runs SELECT * FROM emp_db and returns a list of all employees.

findById(id): Fetches a single employee by their ID.

deleteById(id): Runs DELETE FROM emp_db WHERE id = ?.

existsById(id): Checks if a record exists before you try to delete
*/ 
package org.javaProject.em_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
    
}