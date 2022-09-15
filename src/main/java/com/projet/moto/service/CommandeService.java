package com.projet.moto.service;

import com.projet.moto.model.Commande;
import com.projet.moto.repository.Commanderepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CommandeService {
    private Commanderepository commanderepository;

    public List<Commande>getAllCommande(){
        return commanderepository.findAll();
    }
}
