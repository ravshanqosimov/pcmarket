package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();

    Category getCategory();


}
