package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciShould {
    // + Fibonacci class should be exist
    // + Fibonacci generate method should be implemented
    // + new Fibonacci().generate(0) --> 0
    // + new Fibonacci().generate(1) --> 1
    // + new Fibonacci().generate(2) --> 1
    // + new Fibonacci().generate(3) --> 2
    // + 0, 1, 2, 3, ... 9
    // + 0, 1, 1, 2, ... 34
    // + new Fibonacci().generate(n) --> new Fibonacci().generate(n-1) + new Fibonacci().generate(n-2)
    // + numbers should be greater than 0
    static Fibonacci fibonacci;

    @BeforeEach
    void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    void returnNumberAsIsIfLessThanTwo(){
        assertEquals(0, fibonacci.generate(0));
        assertEquals(1, fibonacci.generate(1));
    }

    @Test
    void returnSumOfPreviousTwoFibonacciForNaturalNumbers(){
        assertEquals(1, fibonacci.generate(2));
        assertEquals(2, fibonacci.generate(3));
        assertEquals(3, fibonacci.generate(4));
        assertEquals(5, fibonacci.generate(5));
        assertEquals(8, fibonacci.generate(6));
        assertEquals(13, fibonacci.generate(7));
        assertEquals(21, fibonacci.generate(8));
        assertEquals(34, fibonacci.generate(9));
    }

    @Test
    void returnSumOfPreviousTwoFibonacciValues(){
        var position = 3;
        var expected = fibonacci.generate(position - 1) + fibonacci.generate(position - 2);
        assertEquals(expected, fibonacci.generate(position));
    }

    @Test
    void worksWithNaturalNumber(){
        assertThrows(InvalidParameterException.class, () -> fibonacci.generate(-1));
        assertThrows(InvalidParameterException.class, () -> fibonacci.generate(-15));
    }
}