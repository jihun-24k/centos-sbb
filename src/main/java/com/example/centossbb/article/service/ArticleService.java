package com.example.centossbb.article.service;

import com.example.centossbb.article.repository.ArticleRepository;
import com.example.centossbb.article.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList() {
        return articleRepository.findAll();
    }

    public void write(String subject) {
        Article article = new Article();
        article.setSubject(subject);

        articleRepository.save(article);
    }
}
