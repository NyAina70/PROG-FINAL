package com.projet.moto.service;

import com.projet.moto.model.Client;
import com.projet.moto.repository.Clientrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Clientservice {
    private Clientrepository clientrepository;
    public List<Client> getAllClient(){

        return clientrepository.findAll();
    }
    public Optional<Client> getAllClientId(int id_client){
        return clientrepository.findById(id_client);
    }
    public Client saveClient(Client client){
        return clientrepository.save(client);
    }
    public void deleteClientById(int id_client){
        clientrepository.deleteById(id_client);
    }
    public void UpdateEmploye (int id_client , String nom_client , String prenom_client , String adresse_client , String tel_client){
        Optional<Client> OptinalClient = clientrepository.findById(id_client);
        if (OptinalClient.isPresent()){
            Client client = OptinalClient.get();
            client.setNom_client(nom_client);
            client.setPrenom_client(prenom_client);
            client.setAdresse_client(adresse_client);
            client.setAdresse_client(adresse_client);

        }
        else {
            throw new IllegalArgumentException("Le Client est introuvable");
        }
    }
}

