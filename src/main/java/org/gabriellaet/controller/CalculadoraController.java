package org.gabriellaet.controller;

import org.gabriellaet.model.Logica;
import org.gabriellaet.model.entities.Calculadora;

public class CalculadoraController {

    Logica logic;
    public CalculadoraController(Logica logic){
        this.logic = logic;
    }

    public Double calculator(Double num1, Double num2, String op){
        return logic.calculatorLogic(num1, num2, op);
    }

}
