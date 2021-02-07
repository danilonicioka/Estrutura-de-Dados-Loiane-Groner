package Parte02_Pilhas_Estaticas_Teste;

import Parte02_Pilhas_Estaticas.Pilha;

public class Pilha_Teste {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<>();
        
        if(pilha.vazia()){
        System.out.println("A pilha está vazia");
        } else
            System.out.println("A pilha não está vazia");
        System.out.println("Elementos da pilha:\n"+pilha);
        System.out.println("Tamanho da pilha: "+pilha.getTamanho());
        
        for(int i=1; i<=10;i++){
            pilha.empilha(i*2-3);
        }
        
        if(pilha.vazia()){
        System.out.println("\nA pilha está vazia");
        } else
            System.out.println("\nA pilha não está vazia");
        
        System.out.println("Elementos da pilha:\n"+pilha);
        System.out.println("Tamanho da pilha: "+pilha.getTamanho());
        
        System.out.println("O elemento no topo da pilha é: "+pilha.topo());
        
        System.out.println("\nAo desempilhar o elemento "+pilha.desempilha()+", os elementos serão:\n"+pilha);
        
        
    }
    
}
