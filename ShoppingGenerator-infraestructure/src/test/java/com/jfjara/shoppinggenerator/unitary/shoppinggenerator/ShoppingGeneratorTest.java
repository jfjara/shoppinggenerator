package com.jfjara.shoppinggenerator.unitary.shoppinggenerator;

import com.jfjara.shoppinggenerator.model.ShoppingDTO;
import com.jfjara.shoppinggenerator.randomgenerator.PersonGenerator;
import com.jfjara.shoppinggenerator.randomgenerator.ProductGenerator;
import com.jfjara.shoppinggenerator.randomgenerator.ShoppingGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ShoppingGeneratorTest {

    ShoppingGenerator shoppingGenerator;

    @Before
    public void init() {
        shoppingGenerator = new ShoppingGenerator(new PersonGenerator(), new ProductGenerator());
    }

    @Test
    public void test() {
        ShoppingDTO shopping = shoppingGenerator.get();
        Assert.assertNotNull(shopping);
        Assert.assertNotNull(shopping.getId());
        Assert.assertNotNull(shopping.getPerson());
        Assert.assertNotNull(shopping.getPerson().getId());
        Assert.assertNotNull(shopping.getProducts());
    }


}
