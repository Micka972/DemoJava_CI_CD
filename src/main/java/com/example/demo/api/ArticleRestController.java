package com.example.demo.api;

import com.example.demo.bo.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleRestController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAll(){
        // Récupérer la list des articles
        List<Article> articles = articleService.getAll();

        return articles;
    }
}
