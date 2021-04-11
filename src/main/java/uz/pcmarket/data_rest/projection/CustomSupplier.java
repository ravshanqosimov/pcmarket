package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.*;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    String getMessageBody();

}
