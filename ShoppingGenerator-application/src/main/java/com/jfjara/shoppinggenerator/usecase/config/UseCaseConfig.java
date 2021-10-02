package com.jfjara.shoppinggenerator.usecase.config;

import com.jfjara.shoppinggenerator.repository.GetShoppingsNowRepository;
import com.jfjara.shoppinggenerator.usecase.GetShoppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetShoppings getShoppings(GetShoppingsNowRepository getShoppingsNowRepository) {
        return new GetShoppings(getShoppingsNowRepository);
    }

}
