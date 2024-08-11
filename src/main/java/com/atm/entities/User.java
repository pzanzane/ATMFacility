package com.atm.entities;

import jakarta.persistence.*;

@Entity
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long userId;

 @Column(unique = true, nullable = false)
 private String username;

 @Column(unique = false, nullable = false)
 private String password;

 @Column(unique = true, nullable = false)
 private String email;

 public String getUsername() {
  return username;
 }

 public String getPassword() {
  return password;
 }

 public String getEmail() {
  return email;
 }

 public void setPassword(String password) {
  this.password = password;
 }
}
