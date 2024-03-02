package com.springbootapp.vehicleapp.controllers;

import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public String getCountries(Model model){
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";
    }

    @PostMapping("/addNew")
    public String addNewCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping ("/findById")
    @ResponseBody
    public Optional<Country> findByID(Long id){
        return countryService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateCountry(Country country){
            countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(Long id){
        countryService.deleteCoutry(id);
        return "redirect:/countries";
    }


}
