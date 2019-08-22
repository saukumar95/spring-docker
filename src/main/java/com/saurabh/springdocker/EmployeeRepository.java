package com.saurabh.springdocker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
