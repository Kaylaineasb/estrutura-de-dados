package lista_duplamente_encadeada;

public class NoDup<T>{
    public T info;
    public NoDup<T> prox;
    public NoDup<T> ant;

    public NoDup<T> getProx() {
        return prox;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setProx(NoDup<T> prox) {
        this.prox = prox;
    }

    public NoDup<T> getAnt() {
        return ant;
    }

    public void setAnt(NoDup<T> ant) {
        this.ant = ant;
    }
}
