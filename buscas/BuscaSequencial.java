public class BuscaSequencial {
    public void buscaSequencial(int[] v,int num){
        boolean achou=false;
        int i=0;
        while(i<v.length && achou==false &&num>=v[i]){
            if(v[i]==num){
                achou=true;
            }else{
                i++;
            }
        }
        if(achou==false){
            System.out.println("Numéro não encontrado");
        }else{
            System.out.println("Número encontrado na posição"+ i+1);
        }
    }
}
