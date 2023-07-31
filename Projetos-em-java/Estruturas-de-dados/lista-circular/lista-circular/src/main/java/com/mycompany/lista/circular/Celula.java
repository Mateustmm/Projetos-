
package com.mycompany.lista.circular;


public class Celula {
    
    //Instanciação de atributos
    private int valor;
    private Celula proximo;
    
    //Construtores 
    public Celula(){}
   
    public Celula(int valor){
        this.valor = valor;
        this.proximo= null;
    }
    
    //Getters e Setters 
    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
}
