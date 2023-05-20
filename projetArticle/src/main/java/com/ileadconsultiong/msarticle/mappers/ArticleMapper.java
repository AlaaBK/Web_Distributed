package tn.ileadconsultiong.msarticle.mappers;

import tn.ileadconsultiong.dto.ArticleDto;
import tn.ileadconsultiong.dto.StockDto;
import tn.ileadconsultiong.msarticle.entities.Article;

public class ArticleMapper {
    public static ArticleDto mapToDto(Article article, StockDto stockDto){
        ArticleDto articleDto = ArticleDto.builder()
                .name(article.getName())
                .qte(article.getQte())
                .stock(stockDto)
                .build();
        return articleDto;
    }

    public static Article mapToEntity(ArticleDto articletDto){
        Article article = Article.builder()
                .name(articletDto.getName())
                .qte(articletDto.getQte())
                .idStock(articletDto.getStock().getId())
                .build();
        return article;
    }
}
