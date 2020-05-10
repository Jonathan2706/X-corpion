package com.nfsm.springboot.web.app.models;

public class articulo {

	private String descripcion;
	private String precio;
	private String marca;
	private String cantidad;
	private String proveedor;
	
	public articulo(String descripcion, String precio, String marca, String cantidad, String proveedor) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
	}

	public articulo() {
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
}
