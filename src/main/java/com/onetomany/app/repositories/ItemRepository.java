package com.onetomany.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.app.models.ItemModel;

public interface ItemRepository extends JpaRepository<ItemModel, Long>{

	
	public Optional<ItemModel> findById(long id);
	
}
