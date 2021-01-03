package com.emanuel.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.persona.model.Estado;
import com.emanuel.persona.model.Pais;
import com.emanuel.persona.service.EstadoServiceImpl;
import com.emanuel.persona.service.PaisServiceImpl;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {
	@Autowired
	private EstadoServiceImpl estadoServiceImpl;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Long idPais) {
		return ResponseEntity.ok(estadoServiceImpl.findAllByCountry(idPais));
	}

}
