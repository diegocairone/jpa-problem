package com.cairone.testjpa2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cairone.testjpa2.entities.UsuarioEntity;
import com.cairone.testjpa2.services.UsuarioService;

@SpringBootApplication
public class App implements CommandLineRunner
{
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	@Autowired
	private UsuarioService usuarioService = null;
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		
		LOG.info("HOLA!!");
		
		Iterable<UsuarioEntity> usuarioEntities = usuarioService.buscarTodos();
		for(UsuarioEntity usuarioEntity : usuarioEntities) {
			LOG.info("USERNAME: {}", usuarioEntity.getUsername());
		}
	}
}
