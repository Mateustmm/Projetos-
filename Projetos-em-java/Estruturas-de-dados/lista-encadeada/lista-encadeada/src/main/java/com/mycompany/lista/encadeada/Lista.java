

package com.mycompany.lista.encadeada;

import java.util.Random;
//Implementação de Classe Lista

public class Lista {

    //Implementação de atributos
    private Celula cabeca;

    //Construtores 
    public Lista() {
        this.cabeca = null;
    }

    //Métodos 
    // verifica se a lista está cheia ou vazia
    public boolean Verificador() {

        if (this.cabeca == null) {
            System.out.println("A lista esta vazia");
            return true;
        } else {
            System.out.println("A lista nao esta vazia");
            return false;
        }
    }

    //indica apenas se a lista está vazia, reproveitada por outros métodos
    public boolean ListaVazia() {

        return this.cabeca == null;
    }

    //Mostra os valores da lista de forma crescente
    public void Mostrar() {

        if (ListaVazia()) {
        } else {

            Celula cursor = cabeca;
            while (cursor != null) {
                System.out.println(cursor.getValor());
                cursor = cursor.getProximo();
            }

        }

    }
    
    public void imprimeLista() {
        while (cabeca != null) { // condição
            System.out.println(cabeca);
            cabeca = cabeca.getProximo(); // incremento
        }
    }

    //insere um valor randomico ao final da lista
    public void insereRandomico(int quantidade) {
        Random numero = new Random();
        int i = 0;
        while (i != quantidade) {
            int aleatorio = numero.nextInt(100);
            InsereNoFinal(aleatorio);
            i++;
        }
    }

    //insere um valor determinado no começo da lista
    public void InsereNaFrente(int valor) {

        Celula celula = new Celula(valor);
        celula.setProximo(cabeca);
        cabeca = celula;

    }

    //insere um valor determinado no final da lista
    public void InsereNoFinal(int valor) {

        if (ListaVazia()) {
            InsereNaFrente(valor);
        } else {
            Celula cursor = cabeca;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            Celula celula = new Celula(valor);
            cursor.setProximo(celula);
        }
    }

    //insere um valor determinado depois de uma posição expecifica da célula
    public void InsereDepois(Celula celula, int valor) {

        Celula celula1 = new Celula(valor);
        celula1.setProximo(celula.getProximo());
        celula.setProximo(celula1);

    }

    //remove o primeiro valor da célula
    public Celula removePrimeiro() {

        if (ListaVazia()) {
            System.out.println("A lista esta vazia");
            return null;
        } else {
            Celula cursor = cabeca;
            cabeca = cabeca.getProximo();
            System.out.println("O numero removido eh " + cursor.getValor());
            return cursor;
        }
    }

    //remove um valor de uma posição determinada da célula
    public Celula removeDepois(Celula celula) {

        if (ListaVazia()) {
            System.out.println("A lista esta vazia");
            return null;
        } else {
            Celula anterior = null;
            Celula cursor = cabeca;
            while (cursor.getProximo() != null) {
                anterior = cursor;
                cursor = cursor.getProximo();

                if (cursor.equals(celula)) {

                    System.out.println("O numero removido eh " + cursor.getValor());
                    anterior.setProximo(celula.getProximo());

                }
            }

            return cursor;
        }
    }

    //remove o ultimo valor da célula 
    public Celula removeUltimo() {

        if (ListaVazia()) {
            System.out.println("A lista esta vazia");
            return null;
        } else {
            Celula anterior = null;
            Celula cursor = cabeca;
            while (cursor.getProximo() != null) {
                anterior = cursor;
                cursor = cursor.getProximo();
            }
            anterior.setProximo(cursor.getProximo());
            System.out.println("O numero removido eh " + cursor.getValor());
            return cursor;
        }
    }

    //remove um valor especifico da célula
    public Celula removeValor(int valor) {

        if (ListaVazia()) {
            System.out.println("A lista esta vazia");
            return null;
        } else {

            int i = 0;
            Celula cursor = this.cabeca;
            Celula anterior = null;

            while (cursor != null && cursor.getValor() != valor) {
                anterior = cursor;
                cursor = cursor.getProximo();
                i++;
            }
            anterior.setProximo(cursor.getProximo());
            System.out.println("O numero removido eh " + cursor.getValor());
            return cursor;
        }

    }

    //Getters Setters
    public Celula getCabeca() {
        return cabeca;
    }

}
