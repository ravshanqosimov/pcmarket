package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Category;
@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
