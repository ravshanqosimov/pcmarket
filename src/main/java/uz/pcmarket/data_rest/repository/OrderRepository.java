package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.Order;
import uz.pcmarket.data_rest.projection.CustomOrder;

@RepositoryRestResource(path = "order",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
