package com.example.sample.service;

import com.example.sample.dao.MultiplyDao;
import com.example.sample.model.Multiply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MultiplyService {

    private final MultiplyDao multiplyDao;

    @Autowired
    public MultiplyService(@Qualifier("fakeDao") MultiplyDao multiplyDao) {
        this.multiplyDao = multiplyDao;
    }

    public int addNumbers(Integer number1, Integer number2){
        return multiplyDao.insertNumbers(number1, number2);
    }

    public List<Multiply> getAllNumbers(){
        return multiplyDao.selectAllNumbers();
    }

}
