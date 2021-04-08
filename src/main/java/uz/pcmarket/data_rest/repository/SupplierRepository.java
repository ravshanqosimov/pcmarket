package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Address;
import uz.pcmarket.data_rest.entity.Supplier;

@RepositoryRestResource(path = "supplier" )
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
