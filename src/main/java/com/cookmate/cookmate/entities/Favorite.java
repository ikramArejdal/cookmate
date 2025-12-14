package com.cookmate.cookmate.entities;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@CreationTimestamp
private LocalDateTime addedAt;
@ManyToOne
@JoinColumn(name="user_id")
private User user;
@ManyToOne
@JoinColumn(name="recipe_id")
private Recipe recipe;
}
