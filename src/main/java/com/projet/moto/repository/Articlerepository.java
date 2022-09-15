package com.projet.moto.repository;

import com.projet.moto.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Articlerepository extends JpaRepository<Article, Integer> {
}
