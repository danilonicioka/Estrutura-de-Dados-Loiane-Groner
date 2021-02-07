package Parte01_Arrays_Teste;

import Parte01_Arrays.Vetor;//para poder usar classe Vetor

public class Vetor_Teste01 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println("O tamanho do vetor é: "+vetor.getTamanho());
        
        System.out.println("\nOs elementos do vetor são: "+vetor);
        //não precisa identificar o método para imprimir conteúdo do vetor
    
        System.out.println("\nO elemento na posição 2 é o: "+vetor.busca(1));
    
        System.out.println("NO elemento 1 está na posição "+(vetor.busca("elemento 1")+1));
    }

}
