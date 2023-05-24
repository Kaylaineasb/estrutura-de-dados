package lista_duplamente_encadeada;

public class ListaDupl<T extends Comparable<T>> extends Lista<T> {

    private NoDup<T> inicio;
    private NoDup<T> aux;

    @Override
    public void incluir(T elemento) throws Exception {

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        NoDup<T> novo = new NoDup<>();
        novo.setInfo(elemento);
        int cont = 0;
        this.aux = this.inicio;

        if ((this.inicio == null && posicao == 0)) {
            this.inicio = novo;
            novo.setProx(null);
            novo.setAnt(null);
            return;
        }
        else if((posicao == 0)){
            novo.setAnt(null);
            novo.setProx(this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
            return;
        }
        while (this.aux != null){
            if(cont == posicao){
                novo.setAnt(aux.getAnt());
                aux.getAnt().setProx(novo);
                aux.setAnt(novo);
                novo.setProx(aux);
                return;
            }else{
                cont++;
                this.aux = this.aux.getProx();
            }
        }
        if(cont != posicao){
            throw new Exception("Impossível adicionar seu número , porque a lista tem menos posições ou está vazia");
        }

    }

    @Override
    public T get(int posicao) throws Exception {
        return null;
    }

    @Override
    public int get(T elemnto) throws Exception {
        return 0;
    }

    @Override
    public void remover(int posicao) throws Exception {

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return 0;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        return false;
    }

    @Override
    public Lista<T> subLista(int posInicial, int posFinal) throws Exception {
        ListaDupl<T> subLista = new ListaDupl<>();
        int cont = 0;
        this.aux = this.inicio;
        while(this.aux != null && cont <= posFinal){
            if((cont >= posInicial)){
                subLista.incluir(this.aux.getInfo());
                cont++;
                this.aux =this.aux.getProx();

            }
            else{
                cont++;
                this.aux = this.aux.getProx();
            }
        }
        if(cont < posFinal){
            throw new Exception("Lista menoir que a posição final encontrada");
        }

        return subLista;
    }



}
