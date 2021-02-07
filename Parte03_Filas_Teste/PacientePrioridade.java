package Parte03_Filas_Teste;

public class PacientePrioridade implements Comparable{
//interface com método compareTo
    
    private String nome;
    private int prioridade;

    public PacientePrioridade(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }
    
    public PacientePrioridade(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    //método para comparar objetos(não precisa se importar com o tipo que será definido em <> ao instanciar
    @Override
    public int compareTo(Object o) {
        
        /*
        obj1 > obj2, retorna num > 0 (padrão java: 1)
        obj1 < obj2, retorna num < 0 (padrão java: -1)
        obj1 == obj2, retorna 0
        */
        
        if(this.prioridade > ((PacientePrioridade)o).getPrioridade()){
            return 1;
        } else if(this.prioridade < ((PacientePrioridade)o).getPrioridade()){
            return -1;
        }
        /*
            ((PacientePrioridade)0) "casting"
            Pode-se indicar que a comparação será com outro PacientePrioridade
            ao indicar com <PacientePrioridade> como parâmetro da interface Comparable,
            ou seja, public class PacientePrioridade implements Comparable<PacientePrioridade>,
            o que faria com que o if fosse: 
            if(this.prioridade > (o.getPrioridade()) 
            não precisaria do casting, pois o parâmetro da função seria:
        public int compareTo(PacientePrioridade 0){}
        */
        
        return 0; //viria pra cá caso n fosse os ifs anteriores
        
    }

    @Override
    public String toString() {
        return "PacientePrioridade{" + "nome=" + nome + ", prioridade=" + prioridade + '}';
    }
    
}
