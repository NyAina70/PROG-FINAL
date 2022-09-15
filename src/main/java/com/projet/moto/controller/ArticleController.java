package com.projet.moto.controller;

import com.projet.moto.model.Article;
import com.projet.moto.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class ArticleController {
    private ArticleService articleService;
    @GetMapping("/Article")
    public List<Article> ShowAllArticle(){
        return articleService.getAllArticle();
    }
}
