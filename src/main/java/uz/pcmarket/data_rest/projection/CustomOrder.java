package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.District;
import uz.pcmarket.data_rest.entity.Order;
import uz.pcmarket.data_rest.entity.UserBasket;

import java.sql.Date;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();

    Date getDate();

    UserBasket getUserBasket();

    String getDetails();
}
