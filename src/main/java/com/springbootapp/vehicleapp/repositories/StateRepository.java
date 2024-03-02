package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State,Long> {

}
