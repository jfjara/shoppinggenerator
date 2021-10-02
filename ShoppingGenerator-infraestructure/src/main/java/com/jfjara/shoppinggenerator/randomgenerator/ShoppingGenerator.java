package com.jfjara.shoppinggenerator.randomgenerator;

import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class ShoppingGenerator {

    private final PersonGenerator personGenerator;
    private final ProductGenerator productGenerator;

    @Autowired
    public ShoppingGenerator(PersonGenerator personGenerator, ProductGenerator productGenerator) {
        this.personGenerator = personGenerator;
        this.productGenerator = productGenerator;
    }

    public ShoppingDTO get() {
        Random rn = new Random();
        return ShoppingDTO.builder()
                .id(UUID.randomUUID().toString())
                .person(personGenerator.get())
                .products(IntStream.range(0, rn.nextInt(12))
                        .boxed()
                        .map(i -> productGenerator.get())
                        .collect(Collectors.toList()))
                .registerTimestamp(System.currentTimeMillis() - rn.nextInt(10000))
                .build();
    }
}
