package com.example.demo.controller;

import com.example.demo.repository.IAlbumRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {


    IAlbumRepository albumRepository;
    public HomeController(IAlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    // Reserves a customizable URL
    @GetMapping("/")
    public String index(){

        return "index";
    }
}

// Hey Clause
// Jeg markante mærkelig problemer under hele "prøve-Eksamen" med min PC. Ikke at det var en undskyldning for jeg ik blev færdig
// Men der blev brugt en del tid på det

