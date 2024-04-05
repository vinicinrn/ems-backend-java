package com.vinicreator.emsbackend.mapper;
import com.vinicreator.emsbackend.entities.Employee;
import com.vinicreator.emsbackend.dto.EmployeeDTO;
import org.hibernate.sql.results.graph.embeddable.EmbeddableLoadingLogger;

//converter objetos Java em objetos de transferência de dados (DTOs)
public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}
