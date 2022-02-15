package com.onetomany.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class CarritoController {

	@Autowired
	CarritoService carritoService;
	
	@PostMappint("/carrito")
	
	
	public ResponseEntity<Object> registrar(@ResponseBody CarritoDTO carritoDTO){
		empleadoService.save(empleado);
		
		return new ResponseEntity<Object>(new MensajeDTO("Empleado(a) registrado(a)"),HttpStatus.OK);
	}
}
