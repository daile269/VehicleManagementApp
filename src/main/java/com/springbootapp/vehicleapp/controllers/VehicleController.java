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
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @Autowired
    private VehicleModelService vehicleModelService;

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getVehicle(Model model){
        List<Vehicle> VehicleList = vehicleService.getVehicles();
        model.addAttribute("vehicles",VehicleList);
        List<Location> locationList = locationService.getLocations();
        model.addAttribute("locations",locationList);
        List<Employee> employeeList = employeeService.getEmployees();
        model.addAttribute("employees",employeeList);
        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMakes();
        model.addAttribute("vehicleMakes",vehicleMakeList);
        List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModels();
        model.addAttribute("vehicleModels",vehicleModelList);
        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatus();
        model.addAttribute("vehicleStatus",vehicleStatusList);
        List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleTypes();
        model.addAttribute("vehicleTypes",vehicleTypeList);

        return "vehicle";
    }

    @PostMapping("/addVehicle")
    public String addNewVehicle(Vehicle Vehicle){
        vehicleService.saveVehicle(Vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Vehicle> findByID(Long id){
        return vehicleService.getVehicleByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateVehicle(Vehicle Vehicle){
        vehicleService.saveVehicle(Vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteVehicle(Long id){
        vehicleService.deleteVehicle(id);
        return "redirect:/vehicle";
    }
}
