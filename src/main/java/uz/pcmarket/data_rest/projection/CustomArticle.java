package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Article;
import uz.pcmarket.data_rest.entity.Attachment;

import javax.persistence.OneToOne;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();

    String getTitle();

    String getDescription();

    String getUrlLink();

    Attachment getAttachment();

}
