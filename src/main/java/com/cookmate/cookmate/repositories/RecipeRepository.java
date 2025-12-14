package com.cookmate.cookmate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookmate.cookmate.entities.Recipe;
public interface RecipeRepository extends JpaRepository<Recipe,Long>{
	List<Recipe> findByCreatorId(Long userId);

}
