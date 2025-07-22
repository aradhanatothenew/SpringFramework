package com.Restfull.RestwithSpring.Question8;

import com.Restfull.RestwithSpring.Question2.Employee;
import com.Restfull.RestwithSpring.Question2.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePutController {

    @Autowired
    private EmployeeService employeeService;
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee updatedEmployee) {

        Employee updated = employeeService.updateEmployee(id, updatedEmployee);
        return ResponseEntity.ok(updated);
    }
}


