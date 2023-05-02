package lista_encadeada;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Lista lista = new Lista();
        String opcao = "";
        int num;
        while(!opcao.equals("0")) {



                System.out.println("digite o que você quer fazer com a lista: ");
                System.out.println("opção 0 - sair do programa \n" +
                        "Opção 1 - adicionar número no inicio \n" +
                        "Opção 2 - adicionar no final \n" +
                        "Opção 3 - remover elemento \n" +
                        "Opção 4 - imprimir lista");
                opcao = ler.nextLine();
                if(Integer.parseInt(opcao) == 0){
                    System.out.println("você saiu do programa");
                    return;
                }


                switch (Integer.parseInt(opcao)){
                    case 1 :
                        System.out.println("digite um numero que quer adicionar no incio: ");
                        num = ler.nextInt();
                        lista.incluirInicio(num); // EXECULTA A FUNÇÃO SELECIONA

                        break;
                    case 2:
                        System.out.println("digite um numero que quer adicionar no final: ");
                        num = ler.nextInt();
                        lista.incluirFinal(num); // EXECULTA A FUNÇÃO SELECIONADA

                        break;
                    case 3:
                        System.out.println("digite o número que você quer remover da lista: ");
                        num = ler.nextInt();
                        lista.removerElemento(num);

                        break;

                    case 4:
                        System.out.println(lista.imprimirLista()); // IMPRIMIR A LISTA

                        break;

                    default:
                        System.out.println("digite uma opção válida");
                }



            }
        }

    }


