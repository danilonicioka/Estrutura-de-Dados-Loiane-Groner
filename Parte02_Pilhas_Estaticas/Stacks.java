package Parte02_Pilhas_Estaticas;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        
        //verificar se está vazia
        System.out.println(stack.isEmpty());
        
        //add elementos
        stack.push(1);
        stack.push(5);
        stack.push(8);
        
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        
        //verificar tamanho
        System.out.println(stack.size());
        
        //exibir elementos
        System.out.println(stack);
        
        //verificar item no topo da pilha
        System.out.println(stack.peek());
        
        //desempilhar
        System.out.println(stack.pop());
        
        System.out.println(stack);
        System.out.println(stack.size());
        
        
    }
    
}
