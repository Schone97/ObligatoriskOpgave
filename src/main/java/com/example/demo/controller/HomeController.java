package com.example.demo.controller;

import com.example.demo.repository.IAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @Autowired
    private IAlbumRepository repository;



    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("albumsToReturn", repository.findAll());
        return "index";
    }

    @GetMapping("/create-album")
    public String create(){
        return "create";
    }
    @PostMapping("/create-album")
    public String createAlbum(){
        return "index";
    }
}

// Hey Claus
// Jeg markante mærkelig problemer under hele "prøve-Eksamen" med min PC. Ikke at det var en undskyldning for jeg ik blev færdig
// Men der blev brugt en del tid på det

