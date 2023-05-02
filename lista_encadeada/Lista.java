package lista_encadeada;

public class Lista {
    private No inicio;
    private No fim;
    private No aux;
    private No anterior;
    private String valores;

    public Lista(){
        this.inicio = null;
        this.fim = null;
        this.aux = null;
        this.anterior = null;
    }


    public void incluirInicio(int dado) {
        No novo = new No();
        novo.setNum(dado);

        if(this.inicio ==  null){

            this.inicio = novo;
            this.fim = novo;
            novo.setProx(null);
        }
        else{
            novo.setProx(this.inicio);// O novo nó aponta para o antigo.
            this.inicio = novo; // O novo nó se torna o primeiro.
        }
    }


    public void incluirFinal(int dado) {
        No novo = new No();
        novo.setNum(dado);

        if(this.inicio == null){
            this.inicio = novo;
            this.fim = novo;
            novo.setProx(null);
        }
        else{
            this.fim.setProx(novo);// Nó antigo aponta para o novo nó.
            this.fim = novo;// O novo nó se torna o último
            this.fim.setProx(null);//  O novo nó não aponta para ninguém por ser o último

        }
    }


    public String localizarElementoPelaPosicao(int chave) {
        return null;
    }


    public String localizarPosicacaoDoElemento(int elemento) {
        return null;
    }


    public void removerElemento(int chave) {

        if(this.inicio == null){
            return;
        }
        this.aux = this.inicio;

        boolean achou = false;

        while((this.aux != null) || (!achou)){
            if(this.inicio.getNum() == chave){
                this.inicio = this.inicio.getProx();
                this.aux = null;
                achou = true;

            }
            else if(this.aux.getNum() == chave){
                this.anterior.setProx(this.aux.getProx());
                this.aux = null;
                achou = true;
            }
            else if(this.fim.getNum() == chave){
                this.anterior.setProx(this.aux.getProx());
                this.aux = null;
                this.fim = this.anterior;
                achou = true;
            }
            else{
                this.anterior = this.aux;
                this.aux = this.aux.getProx();

            }
        }
        if(!achou){
            System.out.println("número não encontrado!");
        }
        else{
            System.out.println("número removido!");
        }
    }



    public String imprimirLista(){

        this.aux = this.inicio;
        while(this.aux != null){
            this.valores += aux.getNum()+" ";
            this.aux = this.aux.getProx();
        }
        String resultado = valores;
        valores = "";
        return resultado.replace("null","");

    }

}
