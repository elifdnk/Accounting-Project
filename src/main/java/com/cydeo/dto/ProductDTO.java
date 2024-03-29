package com.cydeo.dto;

import com.cydeo.enums.ProductUnit;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductDTO {

    private Long id;

    @NotBlank(message = "Product Name is required field.")
    @Size(min = 2, max = 100,message = "Product Name must be between 2 and 100 characters long.")
    private String name;

    private Integer quantityInStock;

    @NotNull(message = "Low Limit Alert is a required field.")
    @Min(value = 1, message = "Low Limit Alert should be at least 1.")
    private Integer lowLimitAlert;

    @NotNull(message = "Product Unit is a required field, Please select a Product Unit.")
    private ProductUnit productUnit;

    @NotNull(message = "Category is a required field, Please select a category.")
    private CategoryDTO category;
}
