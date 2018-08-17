package ar.com.ftobares.movies.streaming.model;

public class Documental extends Contenido {
	
	public Documental(String nombre, int duracion, int anioEstreno) {
		super(nombre, duracion, anioEstreno);
	}

	public Boolean contieneUnofficial() {
		return false;
	}

}
