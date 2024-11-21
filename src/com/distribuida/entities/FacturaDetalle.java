package com.distribuida.entities;

public class FacturaDetalle {
	
	
	private int idFacturaDetalle;
	private int cantidad;
	private Double subtotal;
	
	//private int id_factura;
	private Factura factura;
	//private int id_libro;
	private Libro libro;
	
	
	//Constructores
	
	public FacturaDetalle() {}


	public FacturaDetalle(int idFacturaDetalle, int cantidad, Double subtotal, Factura factura, Libro libro) {
		
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}

	
	
	
	// Metodos getters and setters
	
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}


	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}


	public Factura getFactura() {
		return factura;
	}


	// metodo inyector
	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public Libro getLibro() {
		return libro;
	}


	// metodo inyector
	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
	
 
}
