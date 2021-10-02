package com.jfjara.shoppinggenerator.randomgenerator;

import com.jfjara.shoppinggenerator.model.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class ProductGenerator {

    private static final String[] TITLES = { "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10" };

    public ProductDTO get() {

        Random rn = new Random();

        return ProductDTO.builder()
                .id(UUID.randomUUID().toString())
                .price((long) (Math.random() * 150))
                .title(TITLES[rn.nextInt(TITLES.length)])
                .build();
    }

}
