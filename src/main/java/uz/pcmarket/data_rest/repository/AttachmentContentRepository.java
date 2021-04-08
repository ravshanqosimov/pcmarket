package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pcmarket.data_rest.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findAllByAttachmentId(Integer integer);

}
