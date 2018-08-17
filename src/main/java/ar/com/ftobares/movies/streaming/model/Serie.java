package ar.com.ftobares.movies.streaming.model;

public class Serie extends Contenido {

	public Serie(String nombre, int duracion, int anioEstreno, int temporadas) {
		super(nombre, duracion, anioEstreno);
		this.temporadas = temporadas;
	}
	
	private int temporadas;	

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
}
