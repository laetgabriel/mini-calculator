package org.gabriellaet.operacoes.impl;

import org.gabriellaet.operacoes.NumberException;
import org.gabriellaet.operacoes.Operacao;
import org.gabriellaet.operacoes.OperacaoImplements;

public class Divisao extends Operacao implements OperacaoImplements {

    @Override
    public Double calculo(Double num1, Double num2) {
        Operacao.isNum(num1, num2);
        if(num2 == 0){
            throw new NumberException("undefined result");
        }
        return num1/num2;
    }
}
