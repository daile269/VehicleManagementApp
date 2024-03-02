package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.models.State;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;

    @GetMapping
    public String getState(Model model){
        List<State> stateList = stateService.getState();
        model.addAttribute("state",stateList);
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "state";
    }

    @PostMapping("/addState")
    public String addNewState(State state){
        stateService.saveState(state);
        return "redirect:/state";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<State> findByID(Long id){
        return stateService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(State state){
        stateService.saveState(state);
        return "redirect:/state";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(Long id){
        stateService.deleteState(id);
        return "redirect:/state";
    }


}
