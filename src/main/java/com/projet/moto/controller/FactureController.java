package com.projet.moto.controller;

import com.projet.moto.model.Commande;
import com.projet.moto.service.FactureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class FactureController {
    private FactureService factureService;
    @GetMapping("/Facture")
    public List<Commande> ShowAllFacture(){
        return factureService.getAllFacture();
    }
}
