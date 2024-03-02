package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.VehicleModel;
import com.springbootapp.vehicleapp.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/vehicleModel")
public class VehicleModelController {
    @Autowired
    private VehicleModelService VehicleModelService;


    @GetMapping
    public String getVehicleModel(Model model){
        List<VehicleModel> VehicleModelList = VehicleModelService.getVehicleModels();
        model.addAttribute("vehicleModel",VehicleModelList);
        return "vehicleModel";
    }

    @PostMapping("/addVehicleModel")
    public String addNewVehicleModel(VehicleModel VehicleModel){
        VehicleModelService.saveVehicleModel(VehicleModel);
        return "redirect:/vehicleModel";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleModel> findByID(Long id){
        return VehicleModelService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleModel(VehicleModel VehicleModel){
        VehicleModelService.saveVehicleModel(VehicleModel);
        return "redirect:/vehicleModel";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleModel(Long id){
        VehicleModelService.deleteVehicleModel(id);
        return "redirect:/vehicleModel";
    }

}
