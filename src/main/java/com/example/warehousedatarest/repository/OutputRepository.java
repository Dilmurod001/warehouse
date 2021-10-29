package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Output;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "list" , path = "output")
public interface OutputRepository extends JpaRepository<Output, UUID> {
}
