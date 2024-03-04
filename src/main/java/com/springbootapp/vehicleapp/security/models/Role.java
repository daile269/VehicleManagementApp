package com.springbootapp.vehicleapp.security.models;

import com.springbootapp.vehicleapp.models.Auditable;
import com.springbootapp.vehicleapp.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String details;

    @ManyToMany(mappedBy = "roles")
    List<User> users;
}