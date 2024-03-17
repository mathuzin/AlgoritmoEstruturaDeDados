//Autor: Matheus Ohrt Perazzo Leite Galvão
package Exercicio01.src.main.java.aa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vetor = new String[10];
        Scanner tc = new Scanner(System.in);
        int posicao = 0;

        int opcao;
        do {

            System.out.println("\n1 - Cadastrar\n2 - Listar nomes\n3 - Alterar\n4 - Remover\n5 - Finalizar");
            opcao = tc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome que deseja cadastrar: ");
                    vetor[posicao] = tc.next();
                    posicao++;
                    break;

                case 2:
                    System.out.println("Lista dos nomes cadastrados:");
                    for (int i = 0; i < posicao; i++) {
                        System.out.println(vetor[i]);

                    }
                    break;

                case 3:
                    System.out.println("Selecione a posicao do vetor que deseja alterar o nome:");
                    int posicaoo = tc.nextInt();
                    System.out.println("Digite o nome que deseja cadastrar:");
                    vetor[posicaoo - 1] = tc.next();
                    break;

                case 4:
                    System.out.println("Selecione a posicao do vetor que deseja remover o nome:");
                    int posicaooo = tc.nextInt();
                    vetor[posicaooo - 1] = null;
                    break;

                case 5:
                    break;

                default:
                    break;
            }

        } while (opcao != 5);
    }
}
