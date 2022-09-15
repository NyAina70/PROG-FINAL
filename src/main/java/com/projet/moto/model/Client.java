package com.projet.moto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "\"client\"")

public class Client implements Serializable {
    @Id
    int id_client;
    private String nom_client;
    private String prenom_client;
    private String adresse_client;
    private String tel_client;
}
