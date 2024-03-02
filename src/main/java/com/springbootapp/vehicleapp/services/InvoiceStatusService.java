package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.InvoiceStatus;
import com.springbootapp.vehicleapp.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    public List<InvoiceStatus> getInvoiceStatus(){
        return invoiceStatusRepository.findAll();
    }

    public void saveInvoiceStatus(InvoiceStatus invoiceStatus){
        invoiceStatusRepository.save(invoiceStatus);
    }

    public Optional<InvoiceStatus> findById(Long id){
        return invoiceStatusRepository.findById(id);
    }

    public void deleteInvoiceStatus(Long id){
        invoiceStatusRepository.deleteById(id);
    }
}
