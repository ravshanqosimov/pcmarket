package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.data_rest.entity.Comments;
import uz.pcmarket.data_rest.projection.CustomComments;

@RepositoryRestResource(path = "comments",excerptProjection = CustomComments.class)
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}
