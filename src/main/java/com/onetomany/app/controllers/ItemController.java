package com.onetomany.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.app.dto.ItemDTO;
import com.onetomany.app.dto.MensajeDTO;
import com.onetomany.app.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	
	@PostMapping("/item")
	public ResponseEntity<Object> registrar(@RequestBody ItemDTO itemDTO){
		itemService.save(itemDTO);
		return new ResponseEntity<Object>(new MensajeDTO("Item guardado"), HttpStatus.OK);
	}
	
	
}
