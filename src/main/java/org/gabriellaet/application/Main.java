package org.gabriellaet.application;

import org.gabriellaet.controller.CalculadoraController;
import org.gabriellaet.model.Logica;
import org.gabriellaet.model.entities.Calculadora;

public class Main {

    public static void main(String[] args) {
        CalculadoraController calculadora = new CalculadoraController(new Logica());
        System.out.println(calculadora.calculator(2.0, 2.0, "/"));
    }
}
