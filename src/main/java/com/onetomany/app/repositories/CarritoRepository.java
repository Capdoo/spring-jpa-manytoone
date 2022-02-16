package com.onetomany.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.app.models.CarritoModel;

public interface CarritoRepository extends JpaRepository<CarritoModel, Long>{

	
	public Optional<CarritoModel> findById(long id);
	
}
