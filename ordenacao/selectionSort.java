package ordenacao;

public class selectionSort {
    public void ordenar(int[] lista) {
        int pos_min = 0;
        int aux = 0;


        for(int j = 0; j < lista.length -1; j++) {
            pos_min = j;
            for (int i = j+1; i < lista.length; i++) {

                if (lista[i] < lista[pos_min]) {
                    pos_min = i;
                }

            }

            if (lista[j] > lista[pos_min]) {
                aux = lista[j];
                lista[j] = lista[pos_min];
                lista[pos_min] = aux;


            }

        }

    }
}
