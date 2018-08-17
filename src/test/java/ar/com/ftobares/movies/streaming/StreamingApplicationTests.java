package ar.com.ftobares.movies.streaming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ar.com.ftobares.movies.streaming.model.Contenido;
import ar.com.ftobares.movies.streaming.model.Contento;
import ar.com.ftobares.movies.streaming.model.Estado;
import ar.com.ftobares.movies.streaming.model.Peli;
import ar.com.ftobares.movies.streaming.model.Usuario;
import ar.com.ftobares.movies.streaming.service.ClienteService;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamingApplication.class)
public class StreamingApplicationTests {
	
	private static final Logger logger = LogManager.getLogger(StreamingApplicationTests.class);

	@Autowired
	ClienteService clienteService;
	
	@Test
	public void esClienteAntiguo() {
		
		List<Contenido> contenido = new ArrayList<>();
		contenido.add(new Peli("Duro de matar", 120, 1997, 3));
		contenido.add(new Peli("El señor de los anillos", 180, 2000, 5));
		
		Estado alegre = new Contento();
		Usuario usuario = new Usuario("Jose", alegre, contenido);
		
		assertTrue(clienteService.esClienteAntiguo(usuario));
		
	}

}
