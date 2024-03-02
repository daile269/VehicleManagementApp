package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleMake;
import com.springbootapp.vehicleapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;
    public List<VehicleMake> getVehicleMakes(){
        return vehicleMakeRepository.findAll();
    }

    public void saveVehicleMake(VehicleMake vehicleMake){
        vehicleMakeRepository.save(vehicleMake);
    }

    public Optional<VehicleMake> findById(Long id){
        return vehicleMakeRepository.findById(id);
    }

    public void deleteVehicleMake(Long id){
        vehicleMakeRepository.deleteById(id);
    }
}
