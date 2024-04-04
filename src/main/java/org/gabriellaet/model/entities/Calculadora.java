package org.gabriellaet.model.entities;

import org.gabriellaet.model.Logica;

public class Calculadora {

    Logica logic;
    public Calculadora(Logica logic){
        this.logic = logic;
    }

    public Double calculator(Double num1, Double num2, String op){
       return logic.calculatorLogic(num1, num2, op);
    }

}
