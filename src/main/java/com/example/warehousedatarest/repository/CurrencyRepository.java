package com.example.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Currency;

@RepositoryRestResource(collectionResourceRel = "list" , path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
