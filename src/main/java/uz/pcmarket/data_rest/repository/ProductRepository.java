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
import uz.pcmarket.data_rest.projection.CustomProduct;

import java.util.List;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @RestResource(path = "byName")
    Page<Product> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byModel")
    Page<Product> findAllByModel(@Param("model") String model,Pageable pageable );


    @RestResource(path = "byDescription")
    Page<Product> findAllByDescription(@Param("description") String description,Pageable pageable);

    @RestResource(path = "byPrice")
    List<Product> findAllByPriceBetween(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice ,Pageable pageable);

    @RestResource(path = "byCategory")
    Page<Product> findAllByCategory(@Param("category") Category category,Pageable  pageable);

    @RestResource(path = "byActive")
    Page<Product> findAllByActive(@Param("active") boolean active,Pageable pageable);
}
