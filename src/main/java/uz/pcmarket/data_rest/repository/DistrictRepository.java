package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.District;
import uz.pcmarket.data_rest.projection.CustomDistrict;

@RepositoryRestResource(path = "district",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District,Integer> {
}
