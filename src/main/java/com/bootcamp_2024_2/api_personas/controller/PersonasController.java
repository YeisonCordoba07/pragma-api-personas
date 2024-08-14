package com.bootcamp_2024_2.api_personas.controller;

import com.bootcamp_2024_2.api_personas.dto.PersonaDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
public class PersonasController {

    @GetMapping("/nombrePath/{nombre}/{apellido}")
    private PersonaDto getHolaP(@PathVariable String nombre, @PathVariable String apellido){
        return new PersonaDto(nombre, apellido);
    }

    @GetMapping("/nombreRequest")
    private PersonaDto getHolaR(@RequestParam String nombre, @RequestParam String apellido){
        return new PersonaDto(nombre, apellido);
    }

    @PostMapping("/crearPersona")
    private PersonaDto setPersonaDto(@RequestBody PersonaDto personadto){
        return personadto;
    }
}
