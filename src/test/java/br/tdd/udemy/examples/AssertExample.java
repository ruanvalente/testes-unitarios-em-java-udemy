package br.tdd.udemy.examples;

import org.junit.Assert;
import org.junit.Test;

public class AssertExample {

    @Test
    public void test() {
        // Assert boolean's
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        // Assert equals - N tipos
        String name = "Ruan";
        int age = 27;
        
        Assert.assertEquals("Ruan", name);
        Assert.assertEquals(27, age);
    }
}
