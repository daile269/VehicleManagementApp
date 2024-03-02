package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Long> {

}
