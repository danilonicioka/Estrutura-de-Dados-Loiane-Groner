package Parte03_Filas;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    public static void main(String[] args) {
        
        /*
            Pode-se instanciar qualquer classe que implementa uma interface e
            os métodos que estarão disponíveis para utilizar nessa classe são os métodos
            que foram declarados na interface
            Ex em Classe1 e Interface1 neste pacote
/        */
        
            /*Classe1 c = new Classe1();
            c.adiciona();
            c.remove();
            c.teste();*/
            //pode-se utilizar métodos da classe e da interface
        
            /*pode-se declarar a interface1, pois 
            a classe1 é tb o tipo da interface1
            então pode-se declarar a interface1 e insanciar a classe1 no lugar
            */
            /*Interface1 i = new Classe1();
            i.adiciona();
            i.remove();*/
            /*i.teste(); //não pode-se usar o método teste, 
            pois é disponível apenas na classe1*/
            
            //Queue<Integer> fila = new Queue<>();
            /*Não é possível instanciar Queue, pois Queue é uma interface
            O que pode-se fazer é utilizar qualquer uma das classes que implementam a classe fila,
            ou seja, declarar uma Queue e instanciar uma classe que implementa a interface Queue
            
            Por exemplo, a classe LinkedList:
            Ela possui outros métodos também, mas
            como o que foi declarado foi a interface Queue, 
            apenas os métodos declarados nessa interface poderão ser utilizados,
            o que garante o comportamento de uma fila(FIFO) na instância da classe LinkedList
            apesar da classe LinkedList possuir outros métodos, como adicionar em uma determinada posição,
            remover de uma determinada posição, o que não se encaixa no comportamento de uma fila
            */
            
            Queue<Integer> fila = new LinkedList<>();
            
            fila.add(1); //enqueue (enfileirar) pode aparecer em outras linguagens para adiocionar
            fila.add(7);
            
            System.out.println("Elementos da fila:\n"+fila);
            System.out.println("Primeiro elemento da fila: "+fila.peek());
            System.out.println("Elemento a ser removido: "+fila.remove()); //deuqueue (desenfileirar)  pode aparecer em outras linguagens para adiocionar
            //por conta da Queue, só remover da primeiria posição
            System.out.println("Elementos da fila:\n"+fila);
    }
    
}
