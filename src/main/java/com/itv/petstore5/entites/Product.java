package com.itv.petstore5.entites;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Product {


    private Integer id;
    @NotNull @NotEmpty

    private String name;
    @NotNull  @NotEmpty

    private String manufacture;
    @NotNull  @NotEmpty

    private String price;
    @NotNull  @NotEmpty
    private String description;
    
}
