package com.onetomany.app.dto;

import java.util.Date;
import java.util.Set;

import com.onetomany.app.models.ItemModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class CartDTO {

	private Long idCart;
	private Integer idClient;
	private Date purchaseDate;
	private Double total;
	private Double taxes;
	private Set<ItemModel> items;
	
}
