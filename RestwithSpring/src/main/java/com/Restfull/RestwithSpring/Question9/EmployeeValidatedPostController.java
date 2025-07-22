package com.Restfull.RestwithSpring.Question9;

import com.Restfull.RestwithSpring.Question2.EmployeeService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validated/employee")
public class EmployeeValidatedPostController {

    @Autowired
    private EmployeeService employeeService;

    // POST with validation
    @PostMapping
    public ResponseEntity<Employee1> createValidatedEmployee(@Valid @RequestBody Employee1 employee) {
        Employee1 saved = employeeService.addEmployee(employee);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}


