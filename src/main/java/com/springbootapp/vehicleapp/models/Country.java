package com.springbootapp.vehicleapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String capital;
    private String description;
    private String nationality;
    private String continent;

    @OneToMany(mappedBy = "country")
    private List<State> states ;

    @OneToMany(mappedBy = "country")
    private List<Client> clients ;

    @OneToMany(mappedBy = "country")
    private List<Employee> employees;

    @OneToMany(mappedBy = "country")
    private List<Location> locations;

    @OneToMany(mappedBy = "country")
    private List<Supplier> suppliers;
}
