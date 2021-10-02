package com.jfjara.shoppinggenerator.repository;

import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import com.jfjara.shoppinggenerator.randomgenerator.ShoppingGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class GetShoppingNowRandomRepository implements GetShoppingsNowRepository {

    private final ShoppingGenerator shoppingGenerator;

    public GetShoppingNowRandomRepository(ShoppingGenerator shoppingGenerator) {
        this.shoppingGenerator = shoppingGenerator;
    }

    @Override
    public List<ShoppingDTO> execute() {
        return IntStream.range(0, (int) ((Math.random() * 120) + 1))
                .boxed()
                .map(i -> shoppingGenerator.get())
                .collect(Collectors.toList());
    }
}
