package com.onetomany.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.app.dto.ItemDTO;
import com.onetomany.app.models.CarritoModel;
import com.onetomany.app.models.ItemModel;
import com.onetomany.app.repositories.CarritoRepository;
import com.onetomany.app.repositories.ItemRepository;

@Service
public class ItemService {

	
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	CarritoRepository carritoRepository;
	
	public void save(ItemDTO itemDTO) {
		//ItemModel item = itemRepository.findById(itemDTO.getIdItem()).get();
		CarritoModel carritoSeleccionado = carritoRepository.findById(itemDTO.getCarrito_id()).get();
		ItemModel nuevoItem = new ItemModel();
			nuevoItem.setNombre(itemDTO.getNombre());
			nuevoItem.setCategoria(itemDTO.getCategoria());
			nuevoItem.setPrecio(itemDTO.getPrecio());
			nuevoItem.setCantidad(itemDTO.getCantidad());
			
			nuevoItem.setCarrito(carritoSeleccionado);
		
		itemRepository.save(nuevoItem);
	}
}
