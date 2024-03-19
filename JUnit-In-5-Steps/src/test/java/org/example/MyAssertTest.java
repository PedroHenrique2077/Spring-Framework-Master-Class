package org.example;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void testAsserts() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");

        assertTrue(test);
        assertFalse(test2);
        assertArrayEquals(new int[] {1,2}, new int[] {1,2});

        assertEquals(3, todos.size());
    }

}