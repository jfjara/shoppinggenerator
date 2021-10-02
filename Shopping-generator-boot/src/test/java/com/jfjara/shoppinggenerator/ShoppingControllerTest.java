package com.jfjara.shoppinggenerator;

import com.jfjara.shoppinggenerator.model.PersonDTO;
import com.jfjara.shoppinggenerator.model.ProductDTO;
import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { Application.class })
@WebAppConfiguration
public class ShoppingControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void get_current_shoppings() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/shopping")).andExpect(status().isOk()).andReturn();
    }

    private List<ShoppingDTO> createShoppings() {
        List<ShoppingDTO> result = new ArrayList<>();
        result.add(createShopping());
        return result;
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
