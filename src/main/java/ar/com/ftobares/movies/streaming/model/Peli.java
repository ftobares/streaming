package ar.com.ftobares.movies.streaming.model;

public class Peli extends Contenido {

	private int cantidadOscars;
	
	public Peli(String nombre, int duracion, int anioEstreno, int cantidadOscars) {
		super(nombre, duracion, anioEstreno);
		this.cantidadOscars = cantidadOscars;
	}

	public int getCantidadOscars() {
		return cantidadOscars;
	}

	public void setCantidadOscars(int cantidadOscars) {
		this.cantidadOscars = cantidadOscars;
	}	
	
}
