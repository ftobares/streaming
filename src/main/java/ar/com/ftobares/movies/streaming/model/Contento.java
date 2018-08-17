package ar.com.ftobares.movies.streaming.model;

public class Contento implements Estado {

	public Contento() {		
	}

	@Override
	public String getEstadoDeAnimo() {
		return new String("Estoy Contento =)");
	}
	
	
}
