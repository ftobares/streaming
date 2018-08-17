package ar.com.ftobares.movies.streaming.model;

public class Melancolico implements Estado {

	public Melancolico(Estado decorado) {	
	}

	@Override
	public String getEstadoDeAnimo() {
		return new String("Estoy melancolico =|");
	}
	
}
