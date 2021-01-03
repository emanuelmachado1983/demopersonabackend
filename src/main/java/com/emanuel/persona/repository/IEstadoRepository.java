package com.emanuel.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuel.persona.model.Estado;

public interface IEstadoRepository extends JpaRepository<Estado, Long> {
	
}
