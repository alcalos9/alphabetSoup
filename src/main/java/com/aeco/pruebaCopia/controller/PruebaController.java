package com.aeco.pruebaCopia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aeco.pruebaCopia.model.Persona;

@RestController
public class PruebaController {

	
	@SuppressWarnings("finally")
	@RequestMapping(value = "/getPersona", method= RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public Persona getUrls(){
		
		Persona persona = new Persona();
		
		try {
			
			persona.setNombre("Alejandro Calderon Osorio");
			persona.setRut("15.877.367-8");
			persona.setEmail("calderon.osorio.alejandro@gmail.com");

		}catch(Exception e) {
			return null;
		}finally {
			return persona;
		}
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
