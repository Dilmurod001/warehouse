package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.UserAdmin;

@RepositoryRestResource(collectionResourceRel = "list" ,path = "user")
public interface UserAdminRepository extends JpaRepository<UserAdmin, Integer> {

}
