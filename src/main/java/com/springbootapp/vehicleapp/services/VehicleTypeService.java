package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleType;
import com.springbootapp.vehicleapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;
    public List<VehicleType> getVehicleTypes(){
        return vehicleTypeRepository.findAll();
    }

    public void saveVehicleType(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

    public Optional<VehicleType> findById(Long id){
        return vehicleTypeRepository.findById(id);
    }

    public void deleteVehicleType(Long id){
        vehicleTypeRepository.deleteById(id);
    }
}
