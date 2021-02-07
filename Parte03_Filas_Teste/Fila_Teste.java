package Parte03_Filas_Teste;

import Parte03_Filas.Fila;

public class Fila_Teste {

    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        if(fila.vazia()){
        System.out.println("A fila está vazia");
        } else
            System.out.println("A fila não está vazia");
        System.out.println("Elementos da fila:\n"+fila);
        System.out.println("Tamanho da fila: "+fila.getTamanho());
        
        for(int i=1; i<=10;i++){
            fila.enfileira(i*2-3);
        }
        
        if(fila.vazia()){
        System.out.println("\nA fila está vazia");
        } else
            System.out.println("\nA fila não está vazia");
        
        System.out.println("Elementos da fila:\n"+fila);
        System.out.println("Tamanho da fila: "+fila.getTamanho());
        
        System.out.println("O primeiro elemento da fila é "+fila.primeiro());
        
        System.out.println("\nAo desenfileirar o elemento "+fila.desenfileira()+", os elementos serão:\n"+fila);
        
        
    }
    
}
