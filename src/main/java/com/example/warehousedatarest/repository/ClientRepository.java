package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Client;

@RepositoryRestResource(collectionResourceRel = "list" , path = "client")
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
