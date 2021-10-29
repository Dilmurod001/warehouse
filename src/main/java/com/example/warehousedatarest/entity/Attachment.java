package com.example.warehousedatarest.entity;


import com.example.warehousedatarest.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Attachment extends AbsEntity {
    private String name, contentType;
    private long size;

}
