package com.example.programa2;

public class Proceso {

    public int numA;
    public int numB;

    public Proceso(){
    }

    public Proceso(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }

    public int Suma(int numA, int numB){
        int resultado = numA + numB;
        return resultado;
    }

    public int Resta(int numA, int numB){
        int resultado = numA - numB;
        return resultado;
    }

    public int Multiplicar(int numA, int numB){
        int resultado = numA * numB;
        return resultado;
    }

    public String Dividir(int numA, int numB){
        String resultado = "";
        if(numB == 0){
            resultado = "Indefinido";
        }else{
            int res = numA / numB;
            resultado = String.valueOf(res);
        }

        return resultado;
    }


    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
}
