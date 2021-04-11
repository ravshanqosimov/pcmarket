package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.District;
import uz.pcmarket.data_rest.entity.Region;

@Projection(types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getName();


}
