package lista_sequencial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String num = null;
        int tamanho;
        int opcao;

        System.out.println("digite o tamanho da sua lista");
        tamanho = ler.nextInt();

        Lista lista = new Lista(tamanho); // CRIANDO UMA NOVA LISTA
        do {


                System.out.println("digite o que você quer fazer com a lista: ");
                System.out.println("opção 0 - sair do programa \n" +
                        "Opção 1 - adicionar número no inicio \n" +
                        "Opção 2 - adicionar no final \n" +
                        "Opção 3 - remover elemento \n" +
                        "Opção 4 - localizar elemento pela posição \n" +
                        "Opção 5 - localizar posição do elemento" );
                opcao = ler.nextInt();
                if(opcao == 0){
                    System.out.println("você saiu do programa");
                    return;
                }


                switch (opcao){
                    case 1 :
                        System.out.println("digite um numero que quer adicionar no incio: ");
                        num = ler.nextLine();
                        lista.incluirInicio(Integer.parseInt(num)); // EXECULTA A FUNÇÃO SELECIONA
                        System.out.println(lista.imprimirLista()); // IMPRIMI A LISTA
                        break;
                    case 2:
                        System.out.println("digite um numero que quer adicionar no final: ");
                        num = ler.nextLine();
                        lista.incluirFinal(Integer.parseInt(num));
                        System.out.println(lista.imprimirLista());
                        break;
                    case 3:
                        System.out.println("digite a posição do elemento que deseja remover: ");
                        num = ler.nextLine();
                        lista.removerElemento(Integer.parseInt(num));
                        System.out.println(lista.imprimirLista());
                        break;
                    case 4:
                        System.out.println("digite a posição do elemento:");
                        num = ler.nextLine();;
                        System.out.println(lista.localizarElementoPelaPosicao(Integer.parseInt(num)));
                        break;
                    case 5:
                        System.out.println("digite o valor do elemento que procura:");
                        num = ler.nextLine();

                        System.out.println(lista.localizarPosicacaoDoElemento(Integer.parseInt(num)));
                        break;

                    default:
                        System.out.println("digite uma opção válida");
                }




        }while(opcao!=0);

    }
}

