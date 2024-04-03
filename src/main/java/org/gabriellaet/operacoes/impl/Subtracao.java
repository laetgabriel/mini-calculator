package org.gabriellaet.operacoes.impl;

import org.gabriellaet.operacoes.Operacao;
import org.gabriellaet.operacoes.OperacaoImplements;

public class Subtracao extends Operacao implements OperacaoImplements {

    @Override
    public Double calculo(Double num1, Double num2) {
        Operacao.isNum(num1, num2);
        return num1-num2;
    }
}
