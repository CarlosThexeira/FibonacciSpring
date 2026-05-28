package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.dto.valueDTO;

@Repository
public class FibonacciRepository 
{
    public valueDTO getValueByIndex(int index)
    {
        return new valueDTO(1,1);
    }
    
}
