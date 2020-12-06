package com.alphabetSoup.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SoupController {

	
	@SuppressWarnings("finally")
	@RequestMapping(value = "/getAlphabet", method= RequestMethod.GET)
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public String getUrls(){
		
		String salida="";
		
		try {
			
			salida = "Prueba Ok";

		}catch(Exception e) {
			return null;
		}finally {
			return salida;
		}
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
