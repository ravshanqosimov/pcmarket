package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.OutputProduct;

@RepositoryRestResource(path = "op" )
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
