package com.atm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long user_id;

 @Column(unique = true, nullable = false)
 private String username;

 @Column(unique = false, nullable = false)
 private String password;

 @Column(unique = true, nullable = false)
 private String email;
}
