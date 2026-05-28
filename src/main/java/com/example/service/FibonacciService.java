package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.FibonacciRepository;

@Service
public class FibonacciService 
{
    @Autowired
    FibonacciRepository repository;

    public String getFibonacciNumberByIndex(int index)
    {
        /*
        La sucesión brindada por la letra: 1, 2, 3, 5, 8, 13, 21, 34...

        No contempla el nùmero 0, sus pasos bases son el 1 y 2.

        Tampoco contempla los numeros negativos ya que, dado un numero "x"
        se forma por la suma de sus dos antecesores y en el conjunto brindado
        solo poseo numeros naturales, por ende, nunca puedo llegar a un numero
        negativo ya que las operaciones entre naturales siempre dan naturales.
        */
        if(index == 0)
            return "La sucesión de Fibonnaci no contempla el indice 0.";

        else if(index < 0)
            return "La sucesión de Fibonacci no contempla los nùmeros negativos.";
        
        else
        {
            







            return "";
        }
    }
}
