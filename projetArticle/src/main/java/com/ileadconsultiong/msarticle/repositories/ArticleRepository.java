package tn.ileadconsultiong.msarticle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ileadconsultiong.msarticle.entities.Article;

public interface ArticleRepository extends JpaRepository <Article, Long>{

}
