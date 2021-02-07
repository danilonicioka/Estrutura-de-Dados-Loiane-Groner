package Parte02_EstruturaDados_Base_Estatica;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() { //ao instanciar sem nd, faz um com capacidade 10
        this(10);
    }
    
    public boolean vazia(){
        return this.tamanho == 0;
    }

    /*os dois métodos "adiciona" estão "protected"
    para que apenas as classe do mesmo pacote-base e 
    as filhas poderão ver esses métodos
    e porque nas classes pilha e fila, não se pode adicionar um elemento em qualquer posição*/
    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        if ((posicao < 0 || posicao > tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
    
    protected void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao;i<tamanho-1;i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) { //sempre que o tamanho do vetor chegar na capacidade limite
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2]; //cria um novo vetor com o dobro da capacidade
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i]; //repassa os elementos do vetor antigo para o novo
            }
            this.elementos = elementosNovos;
        }
    }

    //retorna o tamanho da pilha, ou seja, o último elemento vai ter índice (tamanho-1)
    public int getTamanho() { 
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append("; ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

}
