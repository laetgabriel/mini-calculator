package org.gabriellaet.application;

import org.gabriellaet.model.operacoes.Logica;
import org.gabriellaet.model.operacoes.entities.Calculadora;

public class Main {



    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Logica());
        System.out.println(calculadora.calculator(2.0, 2.0, "/"));
    }
}
