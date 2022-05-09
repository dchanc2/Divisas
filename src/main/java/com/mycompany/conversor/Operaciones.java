
package com.mycompany.conversor;


public class Operaciones {
    private double Valor, resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    private int divisa, divisaResultado;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaResultado() {
        return divisaResultado;
    }

    public void setDivisaResultado(int divisaResultado) {
        this.divisaResultado = divisaResultado;
    }

    public Operaciones() {
        
    }
    public double convertirvalor(){
        
        if(divisa ==0 && divisaResultado==1){
            resultado = Valor * 0.13;
        }
        else if(divisa == 0 && divisaResultado==2){
            resultado = Valor * 0.12;
        }else if(divisa ==0&& divisaResultado==3){
            resultado = Valor * 2.67;
        }else if(divisa==0 && divisaResultado==0){
            resultado = Valor;
        }
        if(divisa ==1 && divisaResultado==0){
            resultado = Valor * 7.67;
        }
        else if(divisa == 1 && divisaResultado==2){
            resultado = Valor * 0.95;
        }else if(divisa ==1&& divisaResultado==3){
            resultado = Valor * 20.43;
        }else if(divisa ==1 && divisaResultado==1){
            resultado = Valor;
        }
         if(divisa ==2 && divisaResultado==0){
            resultado = Valor * 8.07;
        }
        else if(divisa == 2 && divisaResultado==1){
            resultado = Valor * 1.05;
        }else if(divisa ==2&& divisaResultado==3){
            resultado = Valor * 21.50;
        }else if(divisa==2 && divisaResultado==2){
            resultado = Valor;
        }
        if(divisa ==3 && divisaResultado==0){
            resultado = Valor * 0.38;
        }
        else if(divisa == 3 && divisaResultado==1){
            resultado = Valor * 0.049;
        }else if(divisa ==3&& divisaResultado==2){
            resultado = Valor * 0.047;
        }else if(divisa==3 && divisaResultado==3){
            resultado = Valor;
        }
        return resultado;
    }
    
    
    
    
    
}
