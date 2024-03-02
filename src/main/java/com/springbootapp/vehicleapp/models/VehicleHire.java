package com.springbootapp.vehicleapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class VehicleHire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicleId",insertable = false,updatable = false)
    private Vehicle vehicle;
    private Long vehicleId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;

    private String timeOut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;

    private String timeIn;

    @ManyToOne
    @JoinColumn(name="clientId", insertable=false, updatable=false)
    private Client client;
    private Long clientId;

    @ManyToOne
    @JoinColumn(name="locationId", insertable=false, updatable=false)
    private Location location;
    private Long locationId;

    private String price;

    private String remarks;
}
