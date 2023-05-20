package tn.ileadconsultiong.msarticle.services;

import tn.ileadconsultiong.dto.ArticleDto;
import tn.ileadconsultiong.msarticle.entities.Article;
import tn.ileadconsultiong.msarticle.generique.ServiceGenerique;

public interface ArticleService extends ServiceGenerique<Article, Long> {

    ArticleDto getArticleDTO(long id);
}
