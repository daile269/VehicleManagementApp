package com.springbootapp.vehicleapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


//username: daile269
//password: daile

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;

  /*  @ManyToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
            @JoinTable(
                    name = "user_role",
                    joinColumns = {@JoinColumn(name = "user_id")},
                    inverseJoinColumns = {@JoinColumn(name = "role_id")}
            )
    Set<Role> roles = new HashSet<>();*/



}
