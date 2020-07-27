package com.cliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value= "/")
@RestController
public class TesteController {
	
	@GetMapping
	public String retornar() {
		return "Hello World";
	}

}
