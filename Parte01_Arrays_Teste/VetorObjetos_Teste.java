package Parte01_Arrays_Teste;

import Parte01_Arrays.VetorObjetos;

public class VetorObjetos_Teste {
    
    public static void main(String[] args) {
        
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Danilo","99259-6695","danilo.ren12@gmail.com");
        Contato c2 = new Contato("Ren","99259-6695","danilo.ren02@gmail.com");
        Contato c3 = new Contato("Nicioka","99259-6695","danilo.ren03@gmail.com");
        
        Contato c4 = new Contato("Danilo","99259-6695","danilo.ren12@gmail.com");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        
        System.out.println("Tamanho ="+vetor.getTamanho());
        
        System.out.println(vetor);
        
        int pos = vetor.busca(c4);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else{
            System.out.println("Elemento não existe no vetor");
        }
        
    }
    
}
