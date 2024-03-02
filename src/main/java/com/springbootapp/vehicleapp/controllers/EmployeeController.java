package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.*;
import com.springbootapp.vehicleapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @Autowired
    private JobTitleService jobTitleService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping
    public String getEmployee(Model model){
        List<Employee> EmployeeList = employeeService.getEmployees();
        model.addAttribute("employees",EmployeeList);
        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType();
        model.addAttribute("employeeTypes",employeeTypeList);
        List<JobTitle> jobTitleList = jobTitleService.getJobTitle();
        model.addAttribute("jobTitles",jobTitleList);
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        List<State> stateList = stateService.getState();
        model.addAttribute("states",stateList);
        return "employee";
    }

    @PostMapping("/addEmployee")
    public String addNewState(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Employee> findByID(Long id){
        return employeeService.getEmployeeByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteEmployee(Long id){
        employeeService.deleteEmployee(id);
        return "redirect:/employee";
    }
}
