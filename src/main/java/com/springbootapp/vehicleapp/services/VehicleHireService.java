package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleHire;
import com.springbootapp.vehicleapp.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {
    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    public List<VehicleHire> getVehicleHires(){
        return vehicleHireRepository.findAll();
    }

    public void saveVehicleHire(VehicleHire vehicleHire){
        vehicleHireRepository.save(vehicleHire);
    }
    public Optional<VehicleHire> getVehicleHireByID(Long id){
        return vehicleHireRepository.findById(id);
    }
    public void deleteVehicleHire(Long id){
        vehicleHireRepository.deleteById(id);
    }
}
