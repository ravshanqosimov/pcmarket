package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.User;
import uz.pcmarket.data_rest.projection.CustomUser;

@RepositoryRestResource(path = "user" ,excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
