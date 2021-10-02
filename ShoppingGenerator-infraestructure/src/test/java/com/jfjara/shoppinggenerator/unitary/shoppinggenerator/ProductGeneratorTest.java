package com.jfjara.shoppinggenerator.unitary.shoppinggenerator;

import com.jfjara.shoppinggenerator.model.ProductDTO;
import com.jfjara.shoppinggenerator.randomgenerator.ProductGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ProductGeneratorTest {

    ProductGenerator productGenerator;

    @Before
    public void init() {
        productGenerator = new ProductGenerator();
    }

    @Test
    public void test_Generate_Valid_Product() {

        ProductDTO product = productGenerator.get();
        Assert.assertNotNull(product.getId());
        Assert.assertNotNull(product.getPrice());
        Assert.assertTrue(product.getPrice() > 0);
        Assert.assertNotNull(product.getTitle());

    }

}
