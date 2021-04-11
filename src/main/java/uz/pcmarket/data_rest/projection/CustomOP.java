package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.Characteristic;
import uz.pcmarket.data_rest.entity.OutputProduct;
import uz.pcmarket.data_rest.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOP {
    Integer getId();

    Product getProduct();

    String getAmount();
}
