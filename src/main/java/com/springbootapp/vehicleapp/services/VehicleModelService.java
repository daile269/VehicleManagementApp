package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleModel;
import com.springbootapp.vehicleapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    private VehicleModelRepository vehicleModelRepository;
    public List<VehicleModel> getVehicleModels(){
        return vehicleModelRepository.findAll();
    }

    public void saveVehicleModel(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
    }

    public Optional<VehicleModel> findById(Long id){
        return vehicleModelRepository.findById(id);
    }

    public void deleteVehicleModel(Long id){
        vehicleModelRepository.deleteById(id);
    }
}
