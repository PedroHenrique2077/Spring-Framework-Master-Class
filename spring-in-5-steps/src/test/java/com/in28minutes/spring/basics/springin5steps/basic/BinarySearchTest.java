package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
class BinarySearchTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void testBasicScenario() {

        int actualResult = binarySearch.binarySearch(new int[] {}, 5);

        assertEquals(3, actualResult);

    }

}