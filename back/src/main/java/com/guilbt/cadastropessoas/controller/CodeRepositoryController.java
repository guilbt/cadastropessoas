package com.guilbt.cadastropessoas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/source")
public class CodeRepositoryController {

    @GetMapping()
    public String retrieveUrl() {
        return "https://github.com/guilbt/cadastropessoas";
    }
}
