package ordenacao;

public class bubbleSort {
    public int aux,n,i;
    public void ordenar(int[] lista){
        for(i=0;i<lista.length;i++){
            for(n=lista.length;n>i;n--){
                aux=lista[n];
                lista[n]=lista[n-1];
                lista[n-1]=aux;
            }
        }
    }
}
