package com.example.base.service;

import com.example.base.dto.FNameLNameDto;
import com.example.base.dto.FNameLNameIdDto;
import com.example.base.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<FNameLNameDto> employeesGreaterThanAvgSalary() {
        Double averageSalary = employeeRepository.getAverageSalary();
        return employeeRepository.findAllEmployeesByAverageSalary(averageSalary);
    }

    @Transactional
        public void updateEmployeeSalaryWithSalaryBelowAverage(Double newSalary) {
        Double averageSalary = employeeRepository.getAverageSalary();
        employeeRepository.updateEmployeeSalaryBelowAverageSalary(newSalary, averageSalary);
    }

    @Transactional
    public void deleteEmployeeWithMinimumSalary() {
        Double minSalary = employeeRepository.getMinimumSalary();
        employeeRepository.deleteEmployeeWithMinimumSalary(minSalary);
    }

    public List<FNameLNameIdDto> getEmployeesWithSurnameSingh() {
        return employeeRepository.getEmployeesByLastNameEndingWithSingh();
    }

    @Transactional
    public void deleteEmployeesOverAge(int age) {
        employeeRepository.deleteEmployeesOverAge(age);
    }
}
