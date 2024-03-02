package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.InvoiceStatus;
import com.springbootapp.vehicleapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/invoiceStatus")
public class InvoiceStatusController {
    @Autowired
    private InvoiceStatusService InvoiceStatusService;


    @GetMapping
    public String getInvoiceStatus(Model model){
        List<InvoiceStatus> InvoiceStatusList = InvoiceStatusService.getInvoiceStatus();
        model.addAttribute("invoiceStatus",InvoiceStatusList);
        return "invoiceStatus";
    }

    @PostMapping("/addInvoiceStatus")
    public String addNewInvoiceStatus(InvoiceStatus InvoiceStatus){
        InvoiceStatusService.saveInvoiceStatus(InvoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<InvoiceStatus> findByID(Long id){
        return InvoiceStatusService.findById(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateInvoiceStatus(InvoiceStatus InvoiceStatus){
        InvoiceStatusService.saveInvoiceStatus(InvoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteInvoiceStatus(Long id){
        InvoiceStatusService.deleteInvoiceStatus(id);
        return "redirect:/invoiceStatus";
    }

}
