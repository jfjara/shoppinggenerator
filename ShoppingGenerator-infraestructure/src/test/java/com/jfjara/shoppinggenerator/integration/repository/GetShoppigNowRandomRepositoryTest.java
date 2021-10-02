package com.jfjara.shoppinggenerator.integration.repository;

import com.jfjara.shoppinggenerator.model.PersonDTO;
import com.jfjara.shoppinggenerator.model.ProductDTO;
import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import com.jfjara.shoppinggenerator.randomgenerator.ShoppingGenerator;
import com.jfjara.shoppinggenerator.repository.GetShoppingNowRandomRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetShoppigNowRandomRepositoryTest {

    @Mock
    ShoppingGenerator shoppingGenerator;

    @InjectMocks
    GetShoppingNowRandomRepository getShoppingNowRandomRepository;

    @Test
    public void test() {
        BDDMockito.given(shoppingGenerator.get()).willReturn(createShopping());
        List<ShoppingDTO> shopping = getShoppingNowRandomRepository.execute();
        Assert.assertNotNull(shopping);
        Assert.assertFalse(shopping.isEmpty());
        Assert.assertNotNull(shopping.get(0).getId());
        Assert.assertNotNull(shopping.get(0).getPerson());
        Assert.assertNotNull(shopping.get(0).getPerson().getId());
        Assert.assertNotNull(shopping.get(0).getProducts());
        Assert.assertFalse(shopping.get(0).getProducts().isEmpty());
        Assert.assertNotNull(shopping.get(0).getProducts().get(0).getId());
        Assert.assertTrue(shopping.get(0).getTotalPrice() > 0);

    }

    private ShoppingDTO createShopping() {
        return ShoppingDTO.builder()
                .id("id-1")
                .person(createPerson())
                .products(createProducts())
                .build();
    }

    private PersonDTO createPerson() {
        return PersonDTO.builder().id("u-1").firstName("Manuel").lastName("Ruiz").build();
    }

    private List<ProductDTO> createProducts() {
        List<ProductDTO> products = new ArrayList<>();
        ProductDTO p1 = ProductDTO.builder().id("p-1").title("product1").price(10L).build();
        ProductDTO p2 = ProductDTO.builder().id("p-2").title("product2").price(12L).build();

        products.add(p1);
        products.add(p2);
        return products;

    }


}
