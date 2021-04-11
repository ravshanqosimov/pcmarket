package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.Region;
import uz.pcmarket.data_rest.entity.User;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();

}
