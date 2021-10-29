package com.example.warehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Client extends AbsNameEntity {
    private String phoneNumber;
}
