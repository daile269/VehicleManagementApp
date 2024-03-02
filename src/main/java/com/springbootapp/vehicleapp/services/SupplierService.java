package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Supplier;
import com.springbootapp.vehicleapp.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers(){
        return supplierRepository.findAll();
    }

    public void saveSupplier(Supplier Supplier){
        supplierRepository.save(Supplier);
    }
    public Optional<Supplier> getSupplierByID(Long id){
        return supplierRepository.findById(id);
    }
    public void deleteSupplier(Long id){
        supplierRepository.deleteById(id);
    }
}
