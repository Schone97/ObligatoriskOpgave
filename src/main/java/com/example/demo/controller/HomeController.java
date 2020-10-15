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

