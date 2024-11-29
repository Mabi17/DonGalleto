/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.microservicio_peliculas.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author mabi1
 */
@RestController
public class PeliculaController {
    @GetMapping("/crear")
    public String crear() {
        return "Hello, Microservice!";
    }
}
