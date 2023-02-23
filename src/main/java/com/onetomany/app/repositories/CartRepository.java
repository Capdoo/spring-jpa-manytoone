package com.onetomany.app.repositories;

import java.util.Optional;

import com.onetomany.app.models.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartModel, Long>{

	
	public Optional<CartModel> findById(long id);
	
}
