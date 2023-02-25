package com.ecapack.Api.Ecapack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class apiDemo {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola entro en Srping";
    }
}
