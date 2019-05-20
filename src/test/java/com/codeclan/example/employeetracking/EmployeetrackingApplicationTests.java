package com.codeclan.example.employeetracking;

import com.codeclan.example.employeetracking.models.Employee;
import com.codeclan.example.employeetracking.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jenn = new Employee("Jenn Archibald", 27, 1235, "j@archibald.com");
		employeeRepository.save(jenn);
	}

}
