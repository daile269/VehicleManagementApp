package com.springbootapp.vehicleapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "vehicleTypeId",insertable = false,updatable = false)
    private VehicleType vehicleType;
    private Long vehicleTypeId;

    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "vehicleMakeId",insertable = false,updatable = false)
    private VehicleMake vehicleMake;
    private Long vehicleMakeId;

    private String power;
    private String fuelCapacity;



    @ManyToOne
    @JoinColumn(name = "vehicleModelId",insertable = false,updatable = false)
    private VehicleModel vehicleModel;
    private Long vehicleModelId;

    @ManyToOne
    @JoinColumn(name = "vehicleStatusId",insertable = false,updatable = false)
    private VehicleStatus vehicleStatus;
    private Long vehicleStatusId;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "employeeId",insertable = false,updatable = false)
    private Employee inCharge;
    private Long employeeId;

    @ManyToOne
    @JoinColumn(name = "locationId",insertable = false,updatable = false)
    private Location location;
    private Long locationId;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleHire> vehicleHires;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleMaintenance> vehicleMaintenances;
    private String remarks;
}
