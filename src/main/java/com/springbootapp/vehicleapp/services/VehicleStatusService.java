package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleStatus;
import com.springbootapp.vehicleapp.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;
    public List<VehicleStatus> getVehicleStatus(){
        return vehicleStatusRepository.findAll();
    }

    public void saveVehicleStatus(VehicleStatus vehicleStatus){
        vehicleStatusRepository.save(vehicleStatus);
    }

    public Optional<VehicleStatus> findById(Long id){
        return vehicleStatusRepository.findById(id);
    }

    public void deleteVehicleStatus(Long id){
        vehicleStatusRepository.deleteById(id);
    }
}
