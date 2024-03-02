package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.VehicleMaintenance;
import com.springbootapp.vehicleapp.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {
    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;

    public List<VehicleMaintenance> getVehicleMaintenances(){
        return vehicleMaintenanceRepository.findAll();
    }

    public void saveVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }
    public Optional<VehicleMaintenance> getVehicleMaintenanceByID(Long id){
        return vehicleMaintenanceRepository.findById(id);
    }
    public void deleteVehicleMaintenance(Long id){
        vehicleMaintenanceRepository.deleteById(id);
    }
}
