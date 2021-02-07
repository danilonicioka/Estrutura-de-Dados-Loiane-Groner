package Parte03_Filas_Teste;

import Parte03_Filas.FilaComPrioridade;

public class FilaComPrioridade_Teste {

    public static void main(String[] args) {
        
        FilaComPrioridade<PacientePrioridade> fila = new FilaComPrioridade<>();
        
        fila.enfileira(new PacientePrioridade("A",2));
        fila.enfileira(new PacientePrioridade("B",1));
        fila.enfileira(new PacientePrioridade("C",3));
        
        System.out.println(fila);
        
    }
    
}
