package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Employee;
import com.springbootapp.vehicleapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployeeByID(Long id){
        return employeeRepository.findById(id);
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
