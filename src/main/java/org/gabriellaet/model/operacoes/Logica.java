package org.gabriellaet.model.operacoes;

import org.gabriellaet.model.operacoes.entities.impl.Divisao;
import org.gabriellaet.model.operacoes.entities.impl.Multiplicacao;
import org.gabriellaet.model.operacoes.entities.impl.Soma;
import org.gabriellaet.model.operacoes.entities.impl.Subtracao;
import org.gabriellaet.model.operacoes.exceptions.InvalidOperatorException;

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
