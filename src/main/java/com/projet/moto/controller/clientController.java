package com.projet.moto.controller;

import com.projet.moto.model.Client;
import com.projet.moto.service.Clientservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class clientController {
    private Clientservice clientService;
    @GetMapping("")
    public List<Client> ShowAllClient(){
        return clientService.getAllClient();
    }
    @GetMapping("/Client/{id_client}")
    public Optional<Client> getById(@PathVariable int id_client){
        return clientService.getAllClientId(id_client);
    }
    @PostMapping("/Client")
    public Client insertClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }
    @DeleteMapping("/Client/{id_client}")
    public void deleteClient (@PathVariable int id_client){
        clientService.deleteClientById(id_client);
    }
    @PatchMapping("/Client/{id_client}")
    public void ModifierClient(
            @PathVariable int id_client ,
            @RequestParam(name = "Nom_Client" , required = false) String nom_client ,
            @RequestParam(name = "Prenom_Client", required = false) String prenom_client ,
            @RequestParam(name = "Adresse_Client", required = false) String adresse_client ,
            @RequestParam(name = "Tel_Client", required = false) String tel_client
    ){
        
    }
}
