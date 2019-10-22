package com.example.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Multiply {
    private final int number1;
    private final int number2;
    private final int result;

    public Multiply(@JsonProperty("number1") int number1,
                    @JsonProperty("number2") int number2) {
        this.number1 = number1;
        this.number2 = number2;
        result = number1*number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getResult() {
        return result;
    }
}
