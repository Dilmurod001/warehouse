package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Supplier;

@RepositoryRestResource(collectionResourceRel = "list" , path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
