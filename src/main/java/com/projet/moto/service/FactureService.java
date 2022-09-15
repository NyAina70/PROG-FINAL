package com.projet.moto.service;

import com.projet.moto.model.Commande;
import com.projet.moto.repository.Facturerepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FactureService {
    private Facturerepository facturerepository;

    public List<Commande> getAllFacture(){
        return facturerepository.findAll();
    }
}
