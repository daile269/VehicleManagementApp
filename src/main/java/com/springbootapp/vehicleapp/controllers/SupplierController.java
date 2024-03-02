package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Supplier;
import com.springbootapp.vehicleapp.models.Country;
import com.springbootapp.vehicleapp.models.State;
import com.springbootapp.vehicleapp.services.SupplierService;
import com.springbootapp.vehicleapp.services.CountryService;
import com.springbootapp.vehicleapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping
    public String getSupplier(Model model){
        List<Supplier> SupplierList = supplierService.getSuppliers();
        model.addAttribute("suppliers",SupplierList);
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        List<State> stateList = stateService.getState();
        model.addAttribute("states",stateList);
        return "supplier";
    }

    @PostMapping("/addSupplier")
    public String addNewState(Supplier Supplier){
        supplierService.saveSupplier(Supplier);
        return "redirect:/supplier";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Supplier> findByID(Long id){
        return supplierService.getSupplierByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateSupplier(Supplier supplier){
        supplierService.saveSupplier(supplier);
        return "redirect:/supplier";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteSupplier(Long id){
        supplierService.deleteSupplier(id);
        return "redirect:/supplier";
    }
}
