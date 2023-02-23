package com.onetomany.app.services;

import com.onetomany.app.models.CartModel;
import com.onetomany.app.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.app.dto.ItemDTO;
import com.onetomany.app.models.ItemModel;
import com.onetomany.app.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	@Autowired
	CartRepository cartRepository;
	
	public void save(ItemDTO itemDTO) {
		//ItemModel item = itemRepository.findById(itemDTO.getIdItem()).get();
		CartModel selectedCart = cartRepository.findById(itemDTO.getIdCart()).get();
		ItemModel newItem = new ItemModel();
		newItem.setName(itemDTO.getName());
		newItem.setCategory(itemDTO.getCategory());
		newItem.setPrice(itemDTO.getPrice());
		newItem.setQuantity(itemDTO.getQuantity());
		newItem.setCart(selectedCart);
		
		itemRepository.save(newItem);
	}
}
