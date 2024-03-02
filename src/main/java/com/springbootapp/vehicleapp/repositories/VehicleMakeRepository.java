package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake,Long> {

}
