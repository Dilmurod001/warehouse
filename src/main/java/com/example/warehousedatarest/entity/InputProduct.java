package com.example.warehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class InputProduct extends AbsEntity {

    @OneToOne
    private Product product;
    private double amount;
    private double price;
    private Date expireDate;

    @ManyToOne
    private Input input;
}
