package com.jfjara.shoppinggenerator.repository;

import com.jfjara.shoppinggenerator.model.ShoppingDTO;

import java.util.List;

public interface GetShoppingsNowRepository {

    List<ShoppingDTO> execute();

}
