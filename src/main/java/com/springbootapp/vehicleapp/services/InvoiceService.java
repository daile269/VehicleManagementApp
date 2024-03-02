package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Invoice;
import com.springbootapp.vehicleapp.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoice(){
        return invoiceRepository.findAll();
    }

    public void saveInvoice(Invoice Invoice){
        invoiceRepository.save(Invoice);
    }
    public Optional<Invoice> getInvoiceByID(Long id){
        return invoiceRepository.findById(id);
    }
    public void deleteInvoice(Long id){
        invoiceRepository.deleteById(id);
    }
}
