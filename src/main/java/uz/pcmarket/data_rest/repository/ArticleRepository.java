package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Article;



@RepositoryRestResource(path = "article")
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
