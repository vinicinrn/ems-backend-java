package com.vinicreator.emsbackend.repository;

import com.vinicreator.emsbackend.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
