package com.onetomany.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.app.dto.ItemDTO;
import com.onetomany.app.dto.MessageDTO;
import com.onetomany.app.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	
	@PostMapping("/items")
	public ResponseEntity<Object> registerItem(@RequestBody ItemDTO itemDTO){
		itemService.save(itemDTO);
		return new ResponseEntity<Object>(new MessageDTO("Item Saved"), HttpStatus.OK);
	}
	
	
}
