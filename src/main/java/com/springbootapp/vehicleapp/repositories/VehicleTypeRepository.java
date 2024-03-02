package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType,Long> {

}
