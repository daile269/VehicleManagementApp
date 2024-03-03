package com.springbootapp.vehicleapp.controllers;

import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.models.Employee;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;

@Controller
public class ProfileController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private  CountryService countryService;

    @RequestMapping("/profile")
    public String profile(Model model, Principal principal){
        String un = principal.getName();
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("employee",employeeService.findByUsername(un));
        model.addAttribute("countries",countryList);
        return "profile";
    }
    @RequestMapping(value = "/profile/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String updateProfile(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/profile";
    }


}
