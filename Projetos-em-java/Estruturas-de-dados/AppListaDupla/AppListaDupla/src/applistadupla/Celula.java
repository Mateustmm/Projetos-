/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistadupla;

/**
 *
 * @author profsl
 */
public class Celula {

    private int valor;
    private Celula proximo;
    private Celula anterior;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
     public Celula getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula() {
    }

    public Celula(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    @Override
    public String toString() {
        // Converte inteiro para String
        return String.valueOf(this.getValor());
    }
}
