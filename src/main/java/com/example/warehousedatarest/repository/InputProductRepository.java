package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.InputProduct;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "list" , path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct, UUID> {
}
