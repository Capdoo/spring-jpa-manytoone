package com.onetomany.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carts")
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class CartModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cart")
	private Long idCart;
	
	@Column(unique=true)
	private Integer idClient;
	private Date purchaseDate;
	private Double total;
	private Double taxes;
	
    @OneToMany(mappedBy="cart")
	private Set<ItemModel> items;


	
}
