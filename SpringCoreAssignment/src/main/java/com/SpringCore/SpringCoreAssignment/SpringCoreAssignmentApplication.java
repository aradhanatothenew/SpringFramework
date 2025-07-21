package com.SpringCore.SpringCoreAssignment;

import com.SpringCore.SpringCoreAssignment.ApplicationContext.Student;
import com.SpringCore.SpringCoreAssignment.CompenentAutowired.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreAssignmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreAssignmentApplication.class, args);
		ApplicationContext context = SpringApplication.run(Student.class, args);
		Student student = context.getBean(Student.class);
		System.out.println("Student Details:");
		System.out.println("ID     : " + student.getId());
		System.out.println("Name   : " + student.getName());
		System.out.println("Course : " + student.getCourse());


	}

}
