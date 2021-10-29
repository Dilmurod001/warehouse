package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Product;

@RepositoryRestResource(collectionResourceRel = "list" , path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
