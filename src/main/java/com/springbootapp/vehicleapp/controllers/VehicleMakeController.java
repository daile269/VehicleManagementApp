package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.VehicleMake;
import com.springbootapp.vehicleapp.services.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/vehicleMake")
public class VehicleMakeController {
    @Autowired
    private VehicleMakeService VehicleMakeService;



    @GetMapping
    public String getVehicleMake(Model model){
        List<VehicleMake> VehicleMakeList = VehicleMakeService.getVehicleMakes();
        model.addAttribute("vehicleMake",VehicleMakeList);
        
        return "vehicleMake";
    }

    @PostMapping("/addVehicleMake")
    public String addNewVehicleMake(VehicleMake VehicleMake){
        VehicleMakeService.saveVehicleMake(VehicleMake);
        return "redirect:/vehicleMake";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleMake> findByID(Long id){
        return VehicleMakeService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleMake(VehicleMake VehicleMake){
        VehicleMakeService.saveVehicleMake(VehicleMake);
        return "redirect:/vehicleMake";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleMake(Long id){
        VehicleMakeService.deleteVehicleMake(id);
        return "redirect:/vehicleMake";
    }

}
