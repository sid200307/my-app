package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        String expected = "Hello, Maven Project!";
        assertEquals(expected, "Hello, Maven Project!");
    }
}
