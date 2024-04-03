package org.gabriellaet.model.operacoes.entities;

import org.gabriellaet.model.operacoes.exceptions.NumberException;

public class Operacao {

    private Double num1;
    private Double num2;

    public Operacao(){
    }

    public Operacao(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void isNum(Double num1, Double num2){
        if(Double.isNaN(num1) || Double.isNaN(num2)){
            throw new NumberException("not a number");
        }
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }


}
