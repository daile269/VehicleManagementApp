package com.springbootapp.vehicleapp.controllers;


import com.springbootapp.vehicleapp.models.Client;
import com.springbootapp.vehicleapp.models.Invoice;
import com.springbootapp.vehicleapp.models.InvoiceStatus;
import com.springbootapp.vehicleapp.services.ClientService;
import com.springbootapp.vehicleapp.services.InvoiceService;
import com.springbootapp.vehicleapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping
    public String getinvoice(Model model){
        List<Invoice> InvoiceList = invoiceService.getInvoice();
        model.addAttribute("invoices",InvoiceList);
        List<Client> clientList   = clientService.getClients();
        model.addAttribute("clients",clientList);
        List<InvoiceStatus> invoiceStatusList = invoiceStatusService.getInvoiceStatus();
        model.addAttribute("invoiceStatus",invoiceStatusList);
        return "invoice";
    }

    @PostMapping("/addInvoice")
    public String addNewInvoiceStatus(Invoice Invoice){
        invoiceService.saveInvoice(Invoice);
        return "redirect:/invoice";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Optional<Invoice> findByID(Long id){
        return invoiceService.getInvoiceByID(id);
    }

    @RequestMapping (value = "/update",method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateInvoice(Invoice Invoice){
        invoiceService.saveInvoice(Invoice);
        return "redirect:/invoice";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteInvoice(Long id){
        invoiceService.deleteInvoice(id);
        return "redirect:/invoice";
    }
}
