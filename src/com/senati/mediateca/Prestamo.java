package com.senati.mediateca;

public class Prestamo {
	int idprestamo;
	int idsocio;
	int idsoporte;
	int cantidad;
	float monto;
	
	public Prestamo(int idprestamo, int idsocio, int idsoporte, int cantidad, float monto) {
		super();
		this.idprestamo = idprestamo;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.cantidad = cantidad;
		this.monto = monto;
	}

	public Prestamo() {
		super();
	}

	public int getIdprestamo() {
		return idprestamo;
	}

	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}

	public int getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}

	public int getIdsoporte() {
		return idsoporte;
	}

	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Prestamo [idprestamo=" + idprestamo + ", idsocio=" + idsocio + ", idsoporte=" + idsoporte
				+ ", cantidad=" + cantidad + ", monto=" + monto + "]";
	}
	
	
}
