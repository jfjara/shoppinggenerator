package com.jfjara.shoppinggenerator.controller;

import com.jfjara.shoppinggenerator.api.ShoppingApi;
import com.jfjara.shoppinggenerator.mapper.ShoppingMapper;
import com.jfjara.shoppinggenerator.model.Shopping;
import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import com.jfjara.shoppinggenerator.usecase.GetShoppings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ShoppingController implements ShoppingApi {

    @Autowired
    GetShoppings getShoppings;

    @Autowired
    ShoppingMapper shoppingMapper;

    @Override
    public ResponseEntity<List<Shopping>> getShoppings() {
        List<ShoppingDTO> shoppingsDTOs = getShoppings.execute();
        return ResponseEntity.ok(shoppingMapper.asShoppingList(shoppingsDTOs));
    }
}
