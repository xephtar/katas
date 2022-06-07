package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearShould {

    // + Year class should be exist
    // + Year class' constructor should take a parameter
    // + isLeap method should be exist
    // + isLeap method should return boolean
    // new Year(1).isLeap() -> false (1,2,3,5 ...)
    // new Year(4).isLeap() -> true (4,8,12,1996 ...)
    // new Year(100).isLeap() -> false (100,200,300, 500)
    // new Year(400).isLeap() -> true (400, 800, 1200)

    @Test
    void returnTrueForYearOne(){
        var year = new Year(1);
        assertEquals(true, year.isLeap());
    }
}
