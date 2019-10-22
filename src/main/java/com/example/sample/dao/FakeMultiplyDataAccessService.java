package com.example.sample.dao;

import com.example.sample.model.Multiply;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeMultiplyDataAccessService implements MultiplyDao {

    private static List<Multiply> DB = new ArrayList<>();

    @Override
    public int insertNumbers(int number1, int number2) {
        DB.add(new Multiply(number1, number2));
        return 1;
    }

    @Override
    public List<Multiply> selectAllNumbers() {
        return DB;
    }
}

