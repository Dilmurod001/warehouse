package com.example.warehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.warehousedatarest.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
public class UserAdmin extends AbsNameEntity {
    private String lastName;
    private String phoneNumber;
    private String code;
    private String password;

    @ManyToMany
    private List<Warehouse> warehouses;
}
