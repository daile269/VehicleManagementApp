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
@RequestMapping("/vehicleHire")
public class VehicleHireController {

    @Autowired
    private VehicleHireService vehicleHireService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String getVehicleHire(Model model){
        List<VehicleHire> VehicleHireList = vehicleHireService.getVehicleHires();
        model.addAttribute("vehicleHire",VehicleHireList);
        List<Client> clientList = clientService.getClients();
        model.addAttribute("clients",clientList);
        List<Location> locationList = locationService.getLocations();
        model.addAttribute("locations",locationList);
        List<Vehicle> vehicleList = vehicleService.getVehicles();
        model.addAttribute("vehicles",vehicleList);
        return "vehicleHire";
    }

    @PostMapping("/addVehicleHire")
    public String addNewState(VehicleHire vehicleHire){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehicleHire";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleHire> findByID(Long id){
        return vehicleHireService.getVehicleHireByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleHire(VehicleHire vehicleHire){
        vehicleHireService.saveVehicleHire(vehicleHire);
        return "redirect:/vehicleHire";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleHire(Long id){
        vehicleHireService.deleteVehicleHire(id);
        return "redirect:/vehicleHire";
    }
}
