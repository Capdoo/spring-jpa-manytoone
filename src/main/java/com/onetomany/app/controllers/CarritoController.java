package com.onetomany.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.app.dto.CartDTO;
import com.onetomany.app.dto.MessageDTO;
import com.onetomany.app.services.CarritoService;


@RestController
public class CarritoController {

	@Autowired
	CarritoService carritoService;
	
	@PostMapping("/carts")
	public ResponseEntity<Object> registerCart(@RequestBody CartDTO cartDTO){
		carritoService.save(cartDTO);
		return new ResponseEntity<Object>(new MessageDTO("Cart Registered"),HttpStatus.OK);
	}
}
