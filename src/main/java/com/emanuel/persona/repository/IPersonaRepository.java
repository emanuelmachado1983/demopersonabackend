package com.emanuel.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuel.persona.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
