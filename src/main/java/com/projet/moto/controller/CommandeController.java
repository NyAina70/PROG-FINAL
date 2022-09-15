package com.projet.moto.controller;

import com.projet.moto.model.Commande;
import com.projet.moto.service.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class CommandeController {
    private CommandeService commandeService;
    @GetMapping("/Commande")
    public List<Commande> ShowAllCommande(){
        return commandeService.getAllCommande();
    }
}
