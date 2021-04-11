package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.District;

@Projection(types = Address.class)
public interface CustomAddress {
      Integer getId();
       String getStreet();
      String getHomeNumber();
      District getDistrict();

}
