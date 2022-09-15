package com.projet.moto.repository;

import com.projet.moto.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Commanderepository extends JpaRepository<Commande, Integer> {
}
