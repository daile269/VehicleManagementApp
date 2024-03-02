package com.springbootapp.vehicleapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person{

    @ManyToOne
    @JoinColumn(name = "employeeTypeId",insertable = false,updatable = false)
    private EmployeeType employeeType;
    private Long employeeTypeId;

    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name = "jobTitleId",insertable = false,updatable = false)
    private JobTitle jobTitle;
    private Long jobTitleId;

    @OneToMany(mappedBy = "inCharge")
    private List<Vehicle> vehicles;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
}
