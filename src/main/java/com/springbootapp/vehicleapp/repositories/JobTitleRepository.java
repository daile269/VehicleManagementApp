package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle,Long> {

}
