package com.example.sample.dao;

import com.example.sample.model.Multiply;

import java.util.List;

public interface MultiplyDao {

    int insertNumbers(int number1, int number2);

    default int insertNumbers(Multiply multiply){
        return insertNumbers(multiply.getNumber1(), multiply.getNumber2());
    }

    List<Multiply> selectAllNumbers();
}
