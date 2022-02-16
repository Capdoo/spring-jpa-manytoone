package com.onetomany.app.dto;

public class ItemDTO {

	private long idItem;
	private String categoria;
	private String nombre;
	private int cantidad;
	private double precio;
	
	//Cambiar a id
	//private CarritoModel carrito;
	private long carrito_id;
	
	public ItemDTO() {
		super();
	}

	public ItemDTO(long idItem, String categoria, String nombre, int cantidad, double precio, long carrito_id) {
		super();
		this.idItem = idItem;
		this.categoria = categoria;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.carrito_id = carrito_id;
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

	/*
	public CarritoModel getCarrito() {
		return carrito;
	}
	public void setCarrito(CarritoModel carrito) {
		this.carrito = carrito;
	}
	 */

	public long getCarrito_id() {
		return carrito_id;
	}

	public void setCarrito_id(long carrito_id) {
		this.carrito_id = carrito_id;
	}
	
	
}
