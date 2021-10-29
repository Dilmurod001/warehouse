package com.example.warehousedatarest.entity;

import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Currency extends AbsNameEntity {

}
