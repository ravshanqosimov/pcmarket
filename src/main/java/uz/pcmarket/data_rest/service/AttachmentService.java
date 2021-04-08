package uz.pcmarket.data_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pcmarket.data_rest.entity.Attachment;
import uz.pcmarket.data_rest.entity.AttachmentContent;
import uz.pcmarket.data_rest.repository.AttachmentContentRepository;
import uz.pcmarket.data_rest.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;


    public Attachment uploadFile(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            String originalFilename = file.getOriginalFilename();
            long size = file.getSize();
            String contentType = file.getContentType();
            Attachment attachment = new Attachment();
            attachment.setName(originalFilename);
            attachment.setSize(size);
            attachment.setContentType(contentType);
            Attachment savedAttachment = attachmentRepository.save(attachment);
            AttachmentContent attachmentConent = new AttachmentContent();
            attachmentConent.setBytes(file.getBytes());
            attachmentConent.setAttachment(savedAttachment);
            attachmentContentRepository.save(attachmentConent);
            return attachment;

        }
        return null;

    }
    public void downloadFile(  Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();

            Optional<AttachmentContent> allByAttachmentId = attachmentContentRepository.findAllByAttachmentId(id);
            if (allByAttachmentId.isPresent()) {
                AttachmentContent attachmentConent = allByAttachmentId.get();
                response.setHeader("Content-Disposition", "attachment; filename=\""
                        + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentConent.getBytes(), response.getOutputStream());
            }
        }
    }



    public List<Attachment> getAll() {
        return attachmentRepository.findAll();
    }

    public Attachment getById(Integer id) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        return byId.orElse(null);
    }

    public boolean deleteById(Integer id) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Optional<AttachmentContent> optionalAttachmentConent = attachmentContentRepository.findAllByAttachmentId(id);
            if (optionalAttachmentConent.isPresent()) {
                attachmentRepository.deleteById(id);
                attachmentContentRepository.delete(optionalAttachmentConent.get());
                return true;
            }
            return false;
        }
        return false;
    }
}
