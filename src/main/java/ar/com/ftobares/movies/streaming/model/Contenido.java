package ar.com.ftobares.movies.streaming.model;

import java.util.Date;

public abstract class Contenido {
	
	private String nombre;
	
	private int duracion;
	
	private int AnioEstreno;	

	public Contenido(String nombre, int duracion, int anioEstreno) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		AnioEstreno = anioEstreno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnioEstreno() {
		return AnioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		AnioEstreno = anioEstreno;
	}	

}
