package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Characteristic;

@Projection(types = Characteristic.class)
public interface CustomCharacteristic {
    Integer getId();

    String getName();

    String getType();
}
