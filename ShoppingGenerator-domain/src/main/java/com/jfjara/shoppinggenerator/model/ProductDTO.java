package com.jfjara.shoppinggenerator.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class ProductDTO {

    String id;
    String title;
    Long price;

}
