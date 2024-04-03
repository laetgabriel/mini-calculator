package org.gabriellaet.operacoes.impl;

import org.gabriellaet.operacoes.NumberException;
import org.gabriellaet.operacoes.Operacao;
import org.gabriellaet.operacoes.OperacaoImplements;

public class Divisao extends Operacao implements OperacaoImplements {

    @Override
    public Double calculo(Double num1, Double num2) {
        if(Double.isNaN(num1) || Double.isNaN(num2)){
            throw new NumberException("not a number");
        }
        if (num1 == 0 && num2 == 0){
            throw new NumberException("args is 0");
        }
        if(num2 == 0){
            throw new NumberException("undefined result");
        }
        return num1/num2;
    }
}
