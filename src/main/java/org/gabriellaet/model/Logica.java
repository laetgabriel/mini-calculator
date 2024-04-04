package org.gabriellaet.model;

import org.gabriellaet.model.entities.impl.Divisao;
import org.gabriellaet.model.entities.impl.Multiplicacao;
import org.gabriellaet.model.entities.impl.Soma;
import org.gabriellaet.model.entities.impl.Subtracao;
import org.gabriellaet.model.exceptions.InvalidOperatorException;

public class Logica {

    public Double calculatorLogic(Double num1, Double num2, String operator){
        OperacaoImplements op = switch (operator) {
            case "+" -> new Soma();
            case "-" -> new Subtracao();
            case "*" -> new Multiplicacao();
            case "/" -> new Divisao();
            default -> throw new InvalidOperatorException("operator invalid (+ | * | / | -");
        };
       return op.calculo(num1, num2);
    }

}
