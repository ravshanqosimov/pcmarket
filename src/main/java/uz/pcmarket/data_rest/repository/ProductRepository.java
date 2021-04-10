package uz.pcmarket.data_rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.Category;
import uz.pcmarket.data_rest.entity.Product;

@RepositoryRestResource(path = "byProduct")
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @RestResource(path = "byName")
    Page<Product> findAllByName(@Param("name") String name);

    @RestResource(path = "byModel")
    Page<Product> findAllByModel(@Param("model") String model);


    @RestResource(path = "byDescription")
    Page<Product> findAllByDescription(@Param("description") String description);

    @RestResource(path = "byPrice")
    Page<Product> findAllByPriceBetween(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);

    @RestResource(path = "byCategory")
    Page<Product> findAllByCategory(@Param("category") Category category);

    @RestResource(path = "byActive")
    Page<Product> findAllByActive(@Param("active") boolean active);
}
