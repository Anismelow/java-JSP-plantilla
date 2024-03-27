package com.ipartek.modelo.dto;

public class Plantas {

	private int id;
	private String nombre;
	private String estacion;
	private int separacion;
	
	public Plantas() {
      
        this.id = 0;
        this.nombre = "";
        this.estacion = "";
        this.separacion = 0;
    }
	
	
	public Plantas(int id, String nombre, String estacion, int separacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estacion = estacion;
		this.separacion = separacion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstacion() {
		return estacion;
	}


	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}


	public int getSeparacion() {
		return separacion;
	}


	public void setSeparacion(int separacion) {
		this.separacion = separacion;
	}


	@Override
	public String toString() {
		return "Plantas [id=" + id + ", nombre=" + nombre + ", estacion=" + estacion + ", separacion=" + separacion
				+ "]";
	}
	
	
	
}
