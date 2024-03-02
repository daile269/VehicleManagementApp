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
@RequestMapping("vehicleMaintenance")
public class VehicleMaintenanceController {

    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String getVehicleMaintenance(Model model){
        List<VehicleMaintenance> vehicleMaintenanceList = vehicleMaintenanceService.getVehicleMaintenances();
        model.addAttribute("vehicleMaintenances",vehicleMaintenanceList);
        List<Supplier> supplierList = supplierService.getSuppliers();
        model.addAttribute("suppliers",supplierList);
        List<Vehicle> vehicleList = vehicleService.getVehicles();
        model.addAttribute("vehicles",vehicleList);
        return "vehicleMaintenance";
    }

    @PostMapping("/addVehicleMaintenance")
    public String addNewState(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.saveVehicleMaintenance(vehicleMaintenance);
        return "redirect:/vehicleMaintenance";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findByID(Long id){
        return vehicleMaintenanceService.getVehicleMaintenanceByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.saveVehicleMaintenance(vehicleMaintenance);
        return "redirect:/vehicleMaintenance";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicleMaintenance(Long id){
        vehicleMaintenanceService.deleteVehicleMaintenance(id);
        return "redirect:/vehicleMaintenance";
    }
}
