package ar.com.ftobares.movies.streaming.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import ar.com.ftobares.movies.streaming.model.Contenido;
import ar.com.ftobares.movies.streaming.model.Peli;
import ar.com.ftobares.movies.streaming.model.Usuario;


@Service(value="clienteService")
public class ClienteService {
	
	public Boolean esClienteAntiguo(Usuario usuario) {		
		
		for(int i=0; i < usuario.getHistorialVisualizacion().size(); i++) {
			Contenido cont = usuario.getHistorialVisualizacion().get(i);
			int anioLimiteInferior = Calendar.getInstance().get(Calendar.YEAR) - 10;
			if(cont instanceof Peli &&
					cont.getAnioEstreno() > anioLimiteInferior) {
				return Boolean.FALSE;
			}
		}
		
		return Boolean.TRUE;
	}

}
