package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Category;
import uz.pcmarket.data_rest.entity.Comments;
import uz.pcmarket.data_rest.entity.Product;
import uz.pcmarket.data_rest.entity.User;

@Projection(types = Comments.class)
public interface CustomComments {

    Integer getId();

    String getBody();

    User getUser();

    Product getProduct();

    int getNumberStars();

}
