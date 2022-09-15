package com.projet.moto.service;

import com.projet.moto.model.Article;
import com.projet.moto.repository.Articlerepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ArticleService {
    private Articlerepository articlerepository;
    public List<Article> getAllArticle(){
        return articlerepository.findAll();
    }
}
