package com.bootcamp_2024_2.api_personas.repository;

import com.bootcamp_2024_2.api_personas.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <PersonaEntity, Long> {
}
