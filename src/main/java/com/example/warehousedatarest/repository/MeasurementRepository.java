package com.example.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.warehousedatarest.entity.Measurement;

@RepositoryRestResource(collectionResourceRel = "list", path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
