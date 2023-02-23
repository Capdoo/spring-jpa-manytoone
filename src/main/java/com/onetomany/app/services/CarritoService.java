package com.onetomany.app.services;

import java.util.Date;

import com.onetomany.app.models.CartModel;
import com.onetomany.app.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.app.dto.CartDTO;

@Service
public class CarritoService {

	@Autowired
	CartRepository cartRepository;
	
	public void save(CartDTO cartDTO) {
		CartModel newCart = new CartModel();
			newCart.setIdClient(cartDTO.getIdClient());
			newCart.setPurchaseDate(new Date());
			newCart.setTaxes(cartDTO.getTaxes());
			newCart.setTotal(cartDTO.getTotal());
		cartRepository.save(newCart);
	}
	

}
