package org.javaProject.em_project;

import lombok.AllArgsConstructor;
import lombok.Data; // Creates getters and setters by itself
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String phoneNo;
    private String email;
}