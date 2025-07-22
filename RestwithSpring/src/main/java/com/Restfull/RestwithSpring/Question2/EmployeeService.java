package com.Restfull.RestwithSpring.Question2;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
    public class EmployeeService {
        private Map<Long, Employee> employeeMap = new HashMap<>();

        public List<Employee> getAllEmployees() {
            return new ArrayList<>(employeeMap.values());
        }

        public Employee getEmployeeById(Long id) {
            return employeeMap.get(id);
        }

        public Employee addEmployee(Employee employee) {
            employeeMap.put(employee.getId(), employee);
            return employee;
        }

        public Employee updateEmployee(Long id, Employee updated) {
            employeeMap.put(id, updated);
            return updated;
        }

        public void deleteEmployee(Long id) {
            employeeMap.remove(id);
        }

}
