package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.OutputProduct;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "list" , path = "outputProduct")
public interface OutputProductRepository extends JpaRepository<OutputProduct, UUID> {
}
