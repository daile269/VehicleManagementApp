package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.VehicleType;
import com.springbootapp.vehicleapp.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/vehicleType")
public class VehicleTypeController {
    @Autowired
    private VehicleTypeService VehicleTypeService;


    @GetMapping
    public String getVehicleType(Model model){
        List<VehicleType> VehicleTypeList = VehicleTypeService.getVehicleTypes();
        model.addAttribute("vehicleType",VehicleTypeList);
        return "vehicleType";
    }

    @PostMapping("/addVehicleType")
    public String addNewVehicleType(VehicleType VehicleType){
        VehicleTypeService.saveVehicleType(VehicleType);
        return "redirect:/vehicleType";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleType> findByID(Long id){
        return VehicleTypeService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleType(VehicleType VehicleType){
        VehicleTypeService.saveVehicleType(VehicleType);
        return "redirect:/vehicleType";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleType(Long id){
        VehicleTypeService.deleteVehicleType(id);
        return "redirect:/vehicleType";
    }

}
