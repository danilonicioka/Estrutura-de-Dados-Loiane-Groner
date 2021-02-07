package Parte01_Arrays_Teste;

import Parte01_Arrays.Vetor;

public class Vetor_Teste02 {

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        System.out.println("Os elementos do vetor são:\n"+vetor);
        
        String add = "A";
        int posicao = 3;

        vetor.adiciona(posicao, add);
        
        System.out.println("\nOs elementos do vetor, após adicionar o elemento \""+add+"\" na posição "+(posicao+1)+", são:\n"+vetor);
        
        int remove = vetor.busca("F");
        vetor.remover(remove);
        
        System.out.println("\nOs elementos do vetor, após remover o elemento da posição "+(remove+1)+", são:\n"+vetor);
        
    }
    
}
