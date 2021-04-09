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
    Page<Product> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byModel")
    Page<Product> findAllByModel(String model, Pageable pageable);


    @RestResource(path = "byDescription")
    Page<Product> findAllByDescription(String description, Pageable pageable);

    @RestResource(path = "byPrice")
    Page<Product> findAllByPrice(Double price, Pageable pageable);

    @RestResource(path = "byCategory")
    Page<Product> findAllByCategory(Category category, Pageable pageable);

    @RestResource(path = "byActive")
    Page<Product> findAllByActive(boolean active, Pageable pageable);
}
