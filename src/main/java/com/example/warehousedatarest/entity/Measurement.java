package com.example.warehousedatarest.entity;

import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity

public class Measurement extends AbsNameEntity {
}
