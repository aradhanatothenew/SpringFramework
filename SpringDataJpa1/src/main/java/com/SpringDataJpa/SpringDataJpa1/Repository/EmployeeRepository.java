package com.SpringDataJpa.SpringDataJpa1.Repository;

import com.SpringDataJpa.SpringDataJpa1.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
    List<Employee> findByNameStartingWith(String prefix);
    List<Employee> findByAgeBetween(int startAge, int endAge);
}
