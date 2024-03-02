package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.User;
import com.springbootapp.vehicleapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Long> {

}
