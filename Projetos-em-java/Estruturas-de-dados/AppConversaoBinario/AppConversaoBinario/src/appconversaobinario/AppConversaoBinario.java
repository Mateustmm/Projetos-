/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversaobinario;

import java.util.Scanner;

/**
 *
 * @author 1656007
 */
public class AppConversaoBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        conversorBinario(10);
    }

    public static void conversorBinario(int decimal) throws Exception {
        PilhaSequencial pilha = new PilhaSequencial();
        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.empilha(resto);
            decimal = decimal / 2;
        }
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilha());
        }
    }

}
