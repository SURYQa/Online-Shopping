package com.shoping.onlineshop.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    private String description;
}
