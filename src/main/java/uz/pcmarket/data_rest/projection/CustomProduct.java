package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    String getModel();

    String getDescription();

    Attachment getAttachment();

    Double getPrice();

    Category getCategory();

    Characteristic getCharacteristic();

    boolean getActive();

}
