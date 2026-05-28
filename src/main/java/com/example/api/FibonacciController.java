package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.FibonacciService;

@RestController
@RequestMapping("/getFibonacciNumberByIndex")
public class FibonacciController 
{
    @Autowired
    FibonacciService servicio;

    @GetMapping
    public String getFibonacciNumberByIndex(@RequestParam int index)
    {
        System.out.println("FibonacciController - index = "+index);
        return servicio.getFibonacciNumberByIndex(index);
    }

}
