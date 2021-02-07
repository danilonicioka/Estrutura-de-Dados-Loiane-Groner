package Parte01_Arrays;

import Parte02_EstruturaDados_Base_Estatica.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {
    
    public Lista2(){
        super(); //quando não há parâmetro, chama-se o construtor com this(10)
    }
    
    public Lista2(int capacidade){
        super(capacidade); //chama construtor da superclasse
    }
    
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
