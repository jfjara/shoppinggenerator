package com.jfjara.shoppinggenerator.usecase;

import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import com.jfjara.shoppinggenerator.repository.GetShoppingsNowRepository;

import java.util.List;

public class GetShoppings {

    private final GetShoppingsNowRepository getShoppingsNowRepository;

    public GetShoppings(GetShoppingsNowRepository getShoppingsNowRepository) {
        this.getShoppingsNowRepository = getShoppingsNowRepository;
    }

    public List<ShoppingDTO> execute() {
        return getShoppingsNowRepository.execute();
    }

}
