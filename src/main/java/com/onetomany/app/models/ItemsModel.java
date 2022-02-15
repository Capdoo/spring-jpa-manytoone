package com.onetomany.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ItemsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idItem;
	
	private String categoria;
	private String nombre;
	private int cantidad;
	private double precio;
	
	@ManyToOne
	@JoinColumn(name="carrito_id",referencedColumnName = "id_carrito", nullable=false)
	private CarritoModel carrito;

	public ItemsModel() {
		super();
	}

	public ItemsModel(long idItem, String categoria, String nombre, int cantidad, double precio, CarritoModel carrito) {
		super();
		this.idItem = idItem;
		this.categoria = categoria;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.carrito = carrito;
	}

	public long getIdItem() {
		return idItem;
	}

	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public CarritoModel getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritoModel carrito) {
		this.carrito = carrito;
	}
	
}
