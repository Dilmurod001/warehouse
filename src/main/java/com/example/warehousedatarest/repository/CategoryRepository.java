package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Category;

@RepositoryRestResource(collectionResourceRel = "list" , path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
