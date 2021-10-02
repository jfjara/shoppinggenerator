package com.jfjara.shoppinggenerator.unitary.shoppinggenerator;

import com.jfjara.shoppinggenerator.model.PersonDTO;
import com.jfjara.shoppinggenerator.randomgenerator.PersonGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PersonGeneratorTest {

    PersonGenerator generator;

    @Before
    public void init() {
        generator = new PersonGenerator();
    }

    @Test
    public void test_Generate_Valid_Person() {

        PersonDTO person = generator.get();
        Assert.assertNotNull(person.getId());
        Assert.assertNotNull(person.getFirstName());
        Assert.assertNotNull(person.getLastName());

    }
}
