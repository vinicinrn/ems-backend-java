package com.vinicreator.emsbackend.services.impl;

import com.vinicreator.emsbackend.dto.EmployeeDTO;
import com.vinicreator.emsbackend.entities.Employee;
import com.vinicreator.emsbackend.mapper.EmployeeMapper;
import com.vinicreator.emsbackend.repository.EmployeeRepository;
import com.vinicreator.emsbackend.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO)  {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }

    public static interface EmployeeService {
    }
}
