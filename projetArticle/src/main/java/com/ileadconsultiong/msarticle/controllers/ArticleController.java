package tn.ileadconsultiong.msarticle.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.ileadconsultiong.dto.ArticleDto;
import tn.ileadconsultiong.dto.StockDto;
import tn.ileadconsultiong.msarticle.entities.Article;
import tn.ileadconsultiong.msarticle.generique.RestControllerGenerique;
import tn.ileadconsultiong.msarticle.services.ArticleService;
import tn.ileadconsultiong.msarticle.services.StockClient;

@RestController
@RequiredArgsConstructor
@RequestMapping("article")
public class ArticleController extends RestControllerGenerique<Article, Long> {
    private final ArticleService articleService;
    private final StockClient stockClient;

    @GetMapping(value = "getArticleDTO/{id}")
    public ArticleDto getArticleDTO(@PathVariable(value = "id") long id) {
        return articleService.getArticleDTO(id);
    }

    @GetMapping(value = "stock/{id}")
    public StockDto getStockById(@PathVariable(value = "id") long id) {
        return stockClient.getStockById(id);
    }

}

