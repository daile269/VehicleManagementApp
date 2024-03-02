package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Vehicle;
import com.springbootapp.vehicleapp.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    public void saveVehicle(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }
    public Optional<Vehicle> getVehicleByID(Long id){
        return vehicleRepository.findById(id);
    }
    public void deleteVehicle(Long id){
        vehicleRepository.deleteById(id);
    }
}
