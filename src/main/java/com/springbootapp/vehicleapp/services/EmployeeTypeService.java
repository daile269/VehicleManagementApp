package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.EmployeeType;
import com.springbootapp.vehicleapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;
    public List<EmployeeType> getEmployeeType(){
        return employeeTypeRepository.findAll();
    }

    public void saveEmployeeType(EmployeeType employeeType){
        employeeTypeRepository.save(employeeType);
    }

    public Optional<EmployeeType> findById(Long id){
        return employeeTypeRepository.findById(id);
    }

    public void deleteEmployeeType(Long id){
        employeeTypeRepository.deleteById(id);
    }
}
