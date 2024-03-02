package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.EmployeeType;
import com.springbootapp.vehicleapp.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employeeType")
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping
    public String getEmployeeType(Model model){
        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType();
        model.addAttribute("employeeType",employeeTypeList);
        return "employeeType";
    }

    @PostMapping("/addEmployeeType")
    public String addNewEmployeeType(EmployeeType employeeType){
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<EmployeeType> findByID(Long id){
        return employeeTypeService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateEmployeeType(EmployeeType employeeType){
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteEmployeeType(Long id){
        employeeTypeService.deleteEmployeeType(id);
        return "redirect:/employeeType";
    }

}
