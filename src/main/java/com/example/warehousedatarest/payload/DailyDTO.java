package com.example.warehousedatarest.payload;

import lombok.Data;

@Data
public class DailyDTO {
    private double amount;
    private double sum;
    private String productName;
}
