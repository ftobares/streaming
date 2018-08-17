package ar.com.ftobares.movies.streaming.model;

import java.util.List;

public class Usuario {
	
	private String nombre;
	
	private Estado estado;
	
	private List<Contenido> historialVisualizacion;	

	public Usuario(String nombre, Estado estado, List<Contenido> historialVisualizacion) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.historialVisualizacion = historialVisualizacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Contenido> getHistorialVisualizacion() {
		return historialVisualizacion;
	}

	public void setHistorialVisualizacion(List<Contenido> historialVisualizacion) {
		this.historialVisualizacion = historialVisualizacion;
	}
	
}
