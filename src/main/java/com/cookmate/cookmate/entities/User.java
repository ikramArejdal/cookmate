package com.cookmate.cookmate.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String username;
@Column(unique = true, nullable = false)
private String email;
@Column(nullable = false)
private String password;
@Column(nullable = false)
private String role;
@OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
@JsonIgnore
private List<Recipe> recipes=new ArrayList<>();
@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
@JsonIgnore
private List<Favorite> favorites=new ArrayList<>();
}
