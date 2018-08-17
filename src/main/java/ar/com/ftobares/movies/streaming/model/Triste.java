package ar.com.ftobares.movies.streaming.model;

public class Triste implements Estado {

	public Triste(Estado decorado) {	
	}
	
	@Override
	public String getEstadoDeAnimo() {
		return new String("Estoy Triste =(");
	}

}
