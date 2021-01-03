package com.emanuel.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.persona.model.Pais;
import com.emanuel.persona.service.PaisServiceImpl;

@RestController
@RequestMapping("/paises/")
public class PaisREST {
	@Autowired
	private PaisServiceImpl paisServiceImpl;
	
	@GetMapping()
	private ResponseEntity<List<Pais>> getAllPaises() {
		return ResponseEntity.ok(paisServiceImpl.findAll());
	}
}
