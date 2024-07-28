package com.itsjaypatel.cabbookingapp.entities;

import com.itsjaypatel.cabbookingapp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<Role> roles;
}
