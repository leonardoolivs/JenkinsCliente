package com.cliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value= "/teste")
@RestController
public class TesteController {
	
	@GetMapping(value="/hello")
	public String retornar() {
		return "Hello World";
	}

}
