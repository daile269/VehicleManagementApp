package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.VehicleStatus;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/vehicleStatus")
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService VehicleStatusService;


    @GetMapping
    public String getVehicleStatus(Model model){
        List<VehicleStatus> VehicleStatusList = VehicleStatusService.getVehicleStatus();
        model.addAttribute("vehicleStatus",VehicleStatusList);
        return "vehicleStatus";
    }

    @PostMapping("/addVehicleStatus")
    public String addNewVehicleStatus(VehicleStatus VehicleStatus){
        VehicleStatusService.saveVehicleStatus(VehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleStatus> findByID(Long id){
        return VehicleStatusService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleStatus(VehicleStatus VehicleStatus){
        VehicleStatusService.saveVehicleStatus(VehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleStatus(Long id){
        VehicleStatusService.deleteVehicleStatus(id);
        return "redirect:/vehicleStatus";
    }

}
