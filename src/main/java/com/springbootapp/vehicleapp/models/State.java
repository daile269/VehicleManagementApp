package com.springbootapp.vehicleapp.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class State {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String capital;

    @ManyToOne
    @JoinColumn(name = "countryid",insertable = false,updatable = false)
    private Country country;
    private Long countryid;

    @OneToMany(mappedBy = "state")
    private List<Client> clients;

    @OneToMany(mappedBy = "state")
    private List<Employee> employees;

    @OneToMany(mappedBy = "state")
    private List<Location> locations;

    @OneToMany(mappedBy = "state")
    private List<Supplier> suppliers;

    private String details;

}
