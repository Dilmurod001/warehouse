package com.example.warehousedatarest.repository;


import com.example.warehousedatarest.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, UUID> {

}
