package Parte03_Filas;

import Parte03_Filas_Teste.PacientePrioridade;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public static void main(String[] args) {

        Queue<PacientePrioridade> filaPrioridade = new PriorityQueue<>();
        
        /*Queue<PacientePrioridade> filaPrioridade = new PriorityQueue<>(
            new Comparator<PacientePrioridade>() {
                @Override
                public int compare(PacientePrioridade o1, PacientePrioridade o2){
                    return Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade());
                    //o método compareTo deve ser usado com tipos primitivos do java, 
                    //por isso utiliza-se o Integer.valueOf e compara-se os valores de prioridade entre os dois elementos
                }
            });*/
        /*
        É recomendado implementar a interface(e, consequntemente, o método compareTo) 
        em td classe que deseja comparar, mas, caso não tenha ou queira sobrepôr, 
        pode-se utilizar o parâmetro do PriorityQueue 
        para passar uma instância do Comparator para que possa passar esse método na declaração da fila
        */

        filaPrioridade.add(new PacientePrioridade("A",2));
        filaPrioridade.add(new PacientePrioridade("B",1));
        
        System.out.println(filaPrioridade);
    }
}
