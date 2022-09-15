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
@Table (name = "\"Article\"")

public class Article implements Serializable {
    @Id
    int id_article;
    private String nom_article;
    private String prix_article;
    private String code_barre;
}
