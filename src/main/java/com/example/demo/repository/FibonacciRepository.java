package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.valueDTO;

@Repository
public class FibonacciRepository 
{
    public valueDTO getValueByIndex(int index)
    {
        return new valueDTO(1,1);
    }
    
}
