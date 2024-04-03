package org.gabriellaet.model.operacoes.entities.impl;

import org.gabriellaet.model.operacoes.entities.Operacao;
import org.gabriellaet.model.operacoes.OperacaoImplements;

public class Subtracao extends Operacao implements OperacaoImplements {

    @Override
    public Double calculo(Double num1, Double num2) {
        isNum(num1, num2);
        return num1-num2;
    }
}
