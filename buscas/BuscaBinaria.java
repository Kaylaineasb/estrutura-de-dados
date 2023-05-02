public class BuscaBinaria {
    int inicio,fim,meio;
    boolean achou=false;
    public void busca(int[] v,int num){
        inicio=0;
        fim=v.length-1;
        meio= (inicio+fim)/2;
        while(inicio<=fim && achou==false){
            if (v[meio]==num){
                achou=true;
            }else{
                if (num<v[meio]){
                    fim=meio-1;
                }else{
                    inicio=meio+1;
                    meio=(inicio+fim)/2;
                }
            }
        }
        if(achou==false){
            System.out.println("Número não encontrado");
        }else{
            System.out.println("Número encontrado na posição"+ meio);
        }
    }
}
