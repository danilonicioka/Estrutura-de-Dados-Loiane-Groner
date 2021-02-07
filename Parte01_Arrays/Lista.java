package Parte01_Arrays;

// <> operador diamond: indica tipo da classe

public class Lista<T> {
    //na hora de instanciar, declara o tipo entre o operador diamond

    private T[] elementos; 
    private int tamanho; 

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; 
        /*solução do livro Effective Java - Joshua Bloch
          para criar um vetor de elementos do mesmo tipo definido ao instanciar*/
        this.tamanho = 0; 
    }
    
    public Lista(){
        this(10);
    }

    /*public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        //API reflexion: permite acessar classes, atributos... dinamicamente
        this.tamanho = 0; 
    }*/
    
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public boolean adiciona(int posicao, T elemento){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        this.aumentaCapacidade();
        
        for(int i=this.tamanho-1;i>=posicao;i--){ 
        /*iterando o vetor de trás pra frente 
          para abrir espaço na posição que for passado 
          na var posicao ao aumentar o tamanho do vetor e 
          ao mover os elementos no vetor para o final
        */
            this.elementos[i+1]=this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    //private pois será usado só na classe vetor
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){ //sempre que o tamanho do vetor chegar na capacidade limite
             T[] elementosNovos = (T[]) new Object[this.elementos.length*2]; //cria um novo vetor com o dobro da capacidade
            for(int i=0;i<this.elementos.length;i++){
                elementosNovos[i]=this.elementos[i]; //repassa os elementos do vetor antigo para o novo
            }
            this.elementos = elementosNovos; //atribui o novo vetor ao vetor que estava trabalhando 
        }
    }
    
    public Object busca(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){//evitar posições inexistentes
            throw new IllegalArgumentException("Posição inválida");
            //erro para tratar argumento
        }
        return elementos[posicao];
    }
    
    public int busca(Object elemento){
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1; //posição que não existe no vetor para indicar que não existe o elemento buscado
    }
    
    public boolean remover(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao;i<this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
        return true;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override //pois é um método existente na classe Arrays
    public String toString() {

        StringBuilder s = new StringBuilder(); //classe para organizar(build) uma String
        s.append("["); //método para concatenar strings no objeto s
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append("; "); //para separar elementos por ;
        }
        if (this.tamanho > 0) { 
            s.append(this.elementos[this.tamanho - 1]);
            //para incluir último elemento sem um ; após
        }
        s.append("]");
        return s.toString(); //retorna o objeto s com os elementos do vetor
    }

}
