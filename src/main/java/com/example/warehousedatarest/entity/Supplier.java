package com.example.warehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Supplier extends AbsNameEntity {
    private String phoneNumber;

}
