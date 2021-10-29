package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Input;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "list" , path = "input")
public interface InputRepository extends JpaRepository<Input, UUID> {

}
