package ordenacao;

public class quickSort {
    public void ordenar(int[] lista) {
        ordenar(lista,0,lista.length -1);
    }
    private void ordenar(int[] lista,int inicio, int fim){
        if(inicio < fim){
            int pivo = particao(lista,inicio,fim);
            ordenar(lista,inicio,pivo);
            ordenar(lista,pivo +1, fim);

        }
    }

    private void trocar(int[] lista,int i , int j){
        int aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }

    private int particao(int[] lista, int inicio, int fim){
        int meio = (int)(inicio + fim)/2;
        int i = inicio;
        int j = fim;
        int pivo = lista[meio];
        while(i < j){
            if(pivo >= lista[j]){
                if(pivo <= lista[i]){
                    trocar(lista,i,j);
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
            else{
                j--;
            }
        }
        return j;
    }
}
