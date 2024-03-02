package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Long> {

}
