package uz.pcmarket.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pcmarket.data_rest.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
