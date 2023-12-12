package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping
	public String Hello() {
		return "<b>Hello Turma 68!!</b>";
		
		}
	
		@GetMapping ("/BsmList")
		public List<String>  BsmList () {
			return Arrays.asList("BSM1: Comunicação" , "BSM2:Proatividade", "BSM3: Trabalho em Equipe");
			
		}
			
			@GetMapping ("/Metas")
			public List<String>  MetasList () {
				return Arrays.asList(
						"\"Aprender Spring Boot\",\r\n",
						  "Melhorar habilidades em Java\",\r\n",
					      "Compreender endpoints em uma aplicação web\"\r\n");
			
	}
}
