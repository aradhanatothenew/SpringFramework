package com.Restfull.RestwithSpring.Question9;

import com.Restfull.RestwithSpring.Question2.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee1Service {
        private Map<Long, Employee1> employeeMap = new HashMap<>();

        public List<Employee1> getAllEmployees() {
            return new ArrayList<>(employeeMap.values());
        }

        public Employee1 getEmployeeById(Long id) {
            return employeeMap.get(id);
        }

        public Employee1 addEmployee(Employee1 employee) {
            employeeMap.put(employee.getId(), employee);
            return employee;
        }

        public Employee1 updateEmployee(Long id, Employee1 updated) {
            employeeMap.put(id, updated);
            return updated;
        }

        public void deleteEmployee(Long id) {
            employeeMap.remove(id);
        }

    }

