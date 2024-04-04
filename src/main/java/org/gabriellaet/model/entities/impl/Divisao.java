package org.gabriellaet.model.entities.impl;

import org.gabriellaet.model.OperacaoImplements;
import org.gabriellaet.model.entities.Operacao;
import org.gabriellaet.model.exceptions.NumberException;

public class Divisao extends Operacao implements OperacaoImplements {

    @Override
    public Double calculo(Double num1, Double num2) {
        isNum(num1, num2);
        if(num2 == 0){
            throw new NumberException("undefined result");
        }
        return num1/num2;
    }

}
