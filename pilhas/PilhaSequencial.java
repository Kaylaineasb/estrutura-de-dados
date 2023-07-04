package pilhas;

public class PilhaSequencial <T>{
    private T[] vetorPilha;
    private int capacidade;
    private int tamanho;

    public PilhaSequencial(int capacidadeMax){
        capacidade=capacidadeMax;
        vetorPilha = (T[]) new Object[capacidade];
        tamanho=0;
    }
    public boolean vazia(){
        return tamanho==0;
    }
    public boolean cheia(){
        return tamanho==capacidade;
    }
    public void empilhar(T dado){
        if(cheia()){
            System.out.println("Pilha cheia");
        }else{
            vetorPilha[tamanho]=dado;
            tamanho++;
        }
    }
    public void desempilhar(){
        if(vazia()){
            System.out.println("Pilha vazia");
        }else{
            vetorPilha[tamanho-1]=null;
            tamanho--;
        }
    }
    public T topo(){
        if(vazia()){
            System.out.println("Pilha vazia");
            return null;
        }else{
            return vetorPilha[tamanho-1];
        }
    }
}

