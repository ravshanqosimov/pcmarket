package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Article;
import uz.pcmarket.data_rest.projection.CustomArticle;


@RepositoryRestResource(path = "article",excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
