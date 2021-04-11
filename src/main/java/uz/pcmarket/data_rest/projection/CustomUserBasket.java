package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.OutputProduct;
import uz.pcmarket.data_rest.entity.User;
import uz.pcmarket.data_rest.entity.UserBasket;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {
    Integer getId();

    OutputProduct getOutputProduct();

    Double getAllSum();

    User getUser();
}
