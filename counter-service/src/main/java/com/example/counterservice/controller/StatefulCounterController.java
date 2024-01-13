package com.example.counterservice.controller;


import com.example.counterservice.ds.CounterServiceResponse;
import com.example.counterservice.service.MutableCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter/stateful")
public class StatefulCounterController {

    @Autowired
    public MutableCounter mutableCounter;


    @PostMapping("/countUp")
    public CounterServiceResponse countUp(){
        mutableCounter.countUp();

        return  new CounterServiceResponse(
                mutableCounter.getNumber()
        );
    }

}
