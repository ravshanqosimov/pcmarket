package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Comments;
import uz.pcmarket.data_rest.entity.UserBasket;
import uz.pcmarket.data_rest.projection.CustomUserBasket;

@RepositoryRestResource(path = "userbasket",excerptProjection = CustomUserBasket.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {
}
