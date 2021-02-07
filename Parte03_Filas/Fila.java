package Parte03_Filas;

import Parte02_EstruturaDados_Base_Estatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(){
        super();
    }
    
    public Fila(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento){
        this.adiciona(elemento);
    }
    
    public T desenfileira(){
        
        final int pos = 0;
        //só pode remover o primeiro elemento da fila
        
        if(this.vazia()){
            return null;
        }
        
        T remove_elemento = this.elementos[pos];
        
        this.remove(pos);
        
        return remove_elemento;
    }
    
    public T primeiro(){
        if(this.vazia()){
            return null;
        }
        return this.elementos[0];
    }
    
}
