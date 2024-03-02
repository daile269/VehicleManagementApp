package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.models.Location;
import com.springbootapp.vehicleapp.models.State;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.LocationService;
import com.springbootapp.vehicleapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping
    public String getLocation(Model model){
        List<Location> locationList = locationService.getLocations();
        model.addAttribute("location",locationList);
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        List<State> stateList = stateService.getState();
        model.addAttribute("state",stateList);
        return "location";
    }

    @PostMapping("/addLocation")
    public String addNewState(Location location){
        locationService.saveLocation(location);
        return "redirect:/location";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Location> findByID(Long id){
        return locationService.getLocationByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateLocation(Location location){
        locationService.saveLocation(location);
        return "redirect:/location";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteLocation(Long id){
        locationService.deleteLocation(id);
        return "redirect:/location";
    }
}
