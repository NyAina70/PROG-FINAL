package com.projet.moto.repository;

import com.projet.moto.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientrepository extends JpaRepository<Client, Integer> {

}
