package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.MyTeam;
import uz.pcmarket.data_rest.projection.CustomMyTeam;

@RepositoryRestResource(path = "mayteam",excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {
}
