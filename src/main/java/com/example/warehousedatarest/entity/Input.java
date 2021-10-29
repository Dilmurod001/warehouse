package com.example.warehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Input extends AbsEntity {

    private Date date;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    private String factureNumber;
    private String code;

}
