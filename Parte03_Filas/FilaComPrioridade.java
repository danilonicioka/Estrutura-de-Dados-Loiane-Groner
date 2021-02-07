package Parte03_Filas;

public class FilaComPrioridade<T> extends Fila<T> {

    @Override
    public void enfileira(T elemento){
        
        Comparable<T> chave = (Comparable<T>) elemento;
        //casting para tranformar elemento em Comparable<T>
        
        int i;
        for(i = 0; i<this.tamanho; i++){
            if(chave.compareTo(this.elementos[i]) < 0){
            //compara novo elemento com um elemento já na fila
                break;
                /*se achar um elemento menor, retornará -1, 
                -1<0 é true e o break fará sair do for*/
            }
        }
        //a posição achada estará em i
        this.adiciona(i, elemento); //elemento ou chave
    }
    
}
