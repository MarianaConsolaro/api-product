package com.ms.product.dto;


import com.ms.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {

    private String id;
    private String name;
    private String description;
    private float price;
    private String category;
    private String brand;
    private String stock;
    private String supplier;

    /*
    private String created;
    private String updated;
    private String user;
    */

    public  ProductDTO(Product entity){
        BeanUtils.copyProperties(entity, this);
    }

}
