package com.springbootapp.vehicleapp.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String name;
    private String address;
    private String city;
    private String phone;
    private String website;
    private String email;

    @ManyToOne
    @JoinColumn(name = "countryid",insertable = false,updatable = false)
    private Country country;
    private Long countryid;

    @ManyToOne
    @JoinColumn(name = "stateid",insertable = false,updatable = false)
    private State state;
    private Long stateid;

    @OneToMany(mappedBy = "client")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "client")
    private List<VehicleHire> vehicleHires;

    private String details;
}
