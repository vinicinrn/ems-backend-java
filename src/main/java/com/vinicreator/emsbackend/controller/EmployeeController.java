package com.vinicreator.emsbackend.controller;

import com.vinicreator.emsbackend.dto.EmployeeDTO;
import com.vinicreator.emsbackend.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //ADD EMPLOYEE API REST
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
       EmployeeDTO savedEmployee =  employeeService.createEmployee(employeeDTO);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
