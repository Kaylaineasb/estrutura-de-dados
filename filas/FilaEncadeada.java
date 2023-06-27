package filas;

public class FilaEncadeada {
    private No frente;
    private No traseiro;
    private int tamanho;

    private class No{
        private int elemento;
        private No prox;

        public No(int elemento){
            this.elemento =elemento;
            this.prox=null;
        }
    }

    public FilaEncadeada(){
        frente=null;
        traseiro=null;
        tamanho=0;
    }
    public boolean vazia(){
        return(frente==null);
    }
    public void enfileirar(int elemento){
        No novoNo = new No(elemento);
        if(vazia()){
            frente = novoNo;
            traseiro = novoNo;
        }else {
            traseiro.prox=novoNo;
            traseiro = novoNo;
        }
        tamanho++;
    }
    public int desenfileirar() {
        if (vazia()) {
            System.out.println("A fila está vazia");
            return -1;
        } else {
            int elemento = frente.elemento;
            frente = frente.prox;
            if ((frente == null)) {
                traseiro = null;
            }
            tamanho--;
            return elemento;
        }
    }
    public int tamanho(){
        return tamanho;
    }
    public int frente(){
        if(vazia()){
            System.out.println("A fila está vazia");
            return -1;
        }else{
            return frente.elemento;
        }
    }
}

