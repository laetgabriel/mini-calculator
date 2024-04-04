package org.gabriellaet.model.entities.impl;

import org.gabriellaet.model.entities.Operacao;
import org.gabriellaet.model.OperacaoImplements;

public class Soma extends Operacao implements OperacaoImplements {
    @Override
    public Double calculo(Double num1, Double num2) {
        isNum(num1, num2);
        return num1+num2;
    }
}
