package com.example.sample.api;

import com.example.sample.model.Multiply;
import com.example.sample.service.MultiplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RequestMapping("api/v1/multiply")
@RestController
public class MultiplyController {

    private final MultiplyService multiplyService;

    @Autowired
    public MultiplyController(MultiplyService multiplyService) {
        this.multiplyService = multiplyService;
    }

    @PostMapping
    public void addNumbers(@RequestBody @Valid Multiply multiply){
        multiplyService.addNumbers(multiply.getNumber1(), multiply.getNumber2());
    }

    @GetMapping
    public List<Multiply> getAllNumbers(){
        return multiplyService.getAllNumbers();
    }
}
