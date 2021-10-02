package com.jfjara.shoppinggenerator.randomgenerator;

import com.jfjara.shoppinggenerator.model.PersonDTO;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class PersonGenerator {

    private static final String[] NAMES = { "Manuel", "Alberto", "María", "Luís", "Eduardo", "Carolina", "Inmaculada", "Francisco", "Miguel", "Manuel", "Gema", "Nelson", "Roberto", "Samuel", "Salvador" };
    private static final String[] SURNAMES = { "Pérez", "Gonzalez", "Jara", "Ruíz", "Rico", "Real", "Sánchez", "López", "Varas", "Urrutia", "Lora", "Moreno", "Marín"};

    public PersonDTO get() {

        Random rn = new Random();

        int nameIndex = rn.nextInt(NAMES.length);
        int surnameIndex = rn.nextInt(SURNAMES.length);

        return PersonDTO.builder()
                .id(UUID.randomUUID().toString())
                .firstName(NAMES[nameIndex])
                .lastName(SURNAMES[surnameIndex])
                .build();

    }
}
