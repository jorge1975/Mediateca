package com.senati.mediateca;

public class Cintaaudio extends Soporte{
	//Atributos de la clase Cintaaudio
	String lugar;
	int duracion;
	
	
	
	
	//Constructores llenos
	public Cintaaudio(int id, String titulo, String autor, float precio, String lugar, int duracion) {
		super(id, titulo, autor, precio);
		this.lugar = lugar;
		this.duracion = duracion;
	}
	
	//Constructores vacios
	public Cintaaudio() {
		super();
	}
	// Getters y Setters
	
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
}
