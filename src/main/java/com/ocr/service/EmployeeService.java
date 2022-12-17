package com.ocr.service;

import com.ocr.model.Employee;
import com.ocr.repository.EmployeeProxy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeProxy employeeProxy;

    public Employee getEmployee(final int id) {
        return employeeProxy.getEmployee(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeProxy.getEmployees();
    }

    public void deleteEmployee(final int id){
        employeeProxy.deleteEmployee(id);
    }

    public Employee saveEmployee(Employee e){
        Employee savedEmployee;
        e.setLastName(e.getLastName().toUpperCase());
        if(e.getId() == null) {
            savedEmployee = employeeProxy.createEmployee(e);
        }
        else {
            savedEmployee = employeeProxy.updateEmployee(e);
        }
        return savedEmployee;
    }

}
