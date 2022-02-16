package com.onetomany.app.models;

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
@Table(name="carritos")
public class CarritoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrito")
	private long idCarrito;
	
	@Column(unique=true)
	private int idCliente;
	private Date fechaCompra;
	private double total;
	private double impuestos;
	
    @OneToMany(mappedBy="carrito")
	private Set<ItemModel> items;
    
	public CarritoModel() {
		super();
	}

	public CarritoModel(long idCarrito, int idCliente, Date fechaCompra, double total, double impuestos,
			Set<ItemModel> items) {
		super();
		this.idCarrito = idCarrito;
		this.idCliente = idCliente;
		this.fechaCompra = fechaCompra;
		this.total = total;
		this.impuestos = impuestos;
		this.items = items;
	}


	public long getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(long idCarrito) {
		this.idCarrito = idCarrito;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public Set<ItemModel> getItems() {
		return items;
	}

	public void setItems(Set<ItemModel> items) {
		this.items = items;
	}

	
}
