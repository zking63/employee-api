package com.bharatha.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharatha.springdatarest.employee.entites.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
