package com.onetomany.app.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.app.dto.CarritoDTO;
import com.onetomany.app.models.CarritoModel;
import com.onetomany.app.repositories.CarritoRepository;

@Service
public class CarritoService {
	
	
	@Autowired
	CarritoRepository carritoRepository;
	
	public void save(CarritoDTO carritoDTO) {
		//CarritoModel carrito = carritoRepository.findById(carritoDTO.getIdCarrito()).get();
		CarritoModel nuevoCarrito = new CarritoModel();
			nuevoCarrito.setIdCliente(carritoDTO.getIdCliente());
			nuevoCarrito.setFechaCompra(new Date());
			nuevoCarrito.setImpuestos(carritoDTO.getImpuestos());
			nuevoCarrito.setTotal(carritoDTO.getTotal());
		carritoRepository.save(nuevoCarrito);
	}
	

}
