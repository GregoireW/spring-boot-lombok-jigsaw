package com.example.demo.controllers;

import com.example.demo.beans.OutputBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class SingleController {

    @GetMapping("/")
    public List<OutputBean> list(){
        return Arrays.asList(new OutputBean("a",1), new OutputBean("b", 2));
    }
}
