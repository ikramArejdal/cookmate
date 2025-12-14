package com.cookmate.cookmate.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.*;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String title;
@Column(columnDefinition = "TEXT") 
private String description;
@JdbcTypeCode(SqlTypes.JSON)
@Column(columnDefinition = "json")
private List<String> ingredients;
@JdbcTypeCode(SqlTypes.JSON)
@Column(columnDefinition = "json")
private List<String> steps;
private int cookingTime;
@CreationTimestamp
private LocalDateTime createdAt;
private boolean isPublic;

@ManyToOne
@JoinColumn(name="user_id")
private User creator;
}
