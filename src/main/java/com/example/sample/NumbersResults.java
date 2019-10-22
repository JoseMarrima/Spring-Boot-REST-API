package com.example.sample;

import com.example.sample.model.Multiply;

import java.util.List;

public class NumbersResults {

    private List<Multiply> numbersList;

    public NumbersResults(List<Multiply> numbersList) {
        this.numbersList = numbersList;
    }

    public List<Multiply> getResults() {
        return numbersList;
    }

}
