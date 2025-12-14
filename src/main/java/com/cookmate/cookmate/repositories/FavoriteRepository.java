package com.cookmate.cookmate.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookmate.cookmate.entities.Favorite;
public interface FavoriteRepository extends JpaRepository<Favorite,Long>{
	List<Favorite> findByUserId(Long userId);

}
