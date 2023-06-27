package filas;

public class ExemploFilaSequencial {
    public static void main(String[] args) {
        filaSequencial fila = new filaSequencial(5);
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        fila.desenfileirar();

    }

}
