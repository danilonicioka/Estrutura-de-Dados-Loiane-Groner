package Parte01_Arrays;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("A");
        lista.add("C");
        
        System.out.println(lista);
        //já tem método para exibir elemetos de uma arraylist
        
        lista.add(1,"B");
        System.out.println(lista);
        
        boolean existe = lista.contains("D");
        //verifica se a arraylist possui o elemento repassado no parâmetro
        if(existe){
            System.out.println("Elemento existe no array");
        } else
            System.out.println("Elemento não existe no array");
        
        int pos = lista.indexOf("T");
        /*
        retorna o índica da posição do elemento repassado no argumento
        retorna -1 se o elemento não existe  
        */
        System.out.println(pos);
        
        String busca = lista.get(0);
        //retorna o elemento que está no índice repassado no parâmetro
        
        lista.remove(0);
        lista.remove("C");
        //duas formas de remover um elemento da lista: índice ou o elemento no argumento
        System.out.println(lista);
    }   
    
    
    
}
