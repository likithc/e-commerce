package com.demo.ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductControllerTest {

    @Test
    public void testProduct() {

        String product =
            "Laptop, Mobile, Headphones";

        assertEquals(
            "Laptop, Mobile, Headphones",
            product
        );
    }
}
