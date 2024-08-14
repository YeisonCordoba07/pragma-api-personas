package com.bootcamp_2024_2.api_personas.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDto {
    private String nombre;
    private String apellido;

    public PersonaDto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public PersonaDto(){}
}
