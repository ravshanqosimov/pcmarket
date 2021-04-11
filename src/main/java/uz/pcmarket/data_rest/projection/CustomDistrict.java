package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Article;
import uz.pcmarket.data_rest.entity.Attachment;
import uz.pcmarket.data_rest.entity.District;

@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    String getRegion();
}
