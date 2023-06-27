package filas;

public class filaSequencial {
    private int capacidade; //capacidade máxima da fila
    private int[] lista;
    private int tamanho; //tamanho atual da fila
    private int frente; //indice do elemento da frente da fila
    private int traseira; //indice do elemento da traseira da fila

    public filaSequencial(int tamanhomax){
        capacidade = tamanhomax;
        lista = new int[capacidade];
        tamanho=0;
        frente=0;
        traseira=-1;
    }
    public boolean vazia(){
        return (tamanho==0);
    }
    public  boolean cheia(){
        return (tamanho==capacidade);
    }
    public void enfileirar(int elemento){
        if (cheia()){
            System.out.println("A fila está cheia");
        }else{
            traseira = (traseira+1)%capacidade;
            lista[traseira]= elemento;
            tamanho++;
        }
    }
    public int desenfileirar(){
        if (vazia()){
            System.out.println("Está vazia");
            return -1;
        }else{
            int elemento = lista[frente];
            frente = (frente+1)%capacidade;
            tamanho--;
            return elemento;
        }
    }
    public int tamanho(){
        return tamanho;
    }
}
