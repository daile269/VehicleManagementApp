package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel,Long> {

}
