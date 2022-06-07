package org.example;

import java.security.InvalidParameterException;

public class Fibonacci {
    private static final Integer LOWER_LIMIT = 0;
    public Integer generate(int position) {
        if(position < LOWER_LIMIT){
            throw new InvalidParameterException();
        }

        if(position <= 1){
            return position;
        }

        return this.generate(position - 1) + this.generate(position - 2);
    }
}
