package com.example.warehousedatarest.payload;

import org.springframework.data.rest.core.config.Projection;
import com.example.warehousedatarest.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer id();
    String name();
//    boolean active = true;
}
