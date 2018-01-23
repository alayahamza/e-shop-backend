package com.eshop.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryPayload {
    private int id;
    private String name;
    private String description;
    private int products;
}
