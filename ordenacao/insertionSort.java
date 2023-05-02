package ordenacao;

public class insertionSort {
    int j,aux =0;
    public void ordernar(int[] lista){
        for(int i=1;i<lista.length;i++){
            j=i-1;
            aux=lista[i];
            while(j>=0 && (lista[j]>aux)){
                lista[j+1]=lista[j];
                j=j-1;
            }
            lista[j+1]=aux;
        }
    }
}
