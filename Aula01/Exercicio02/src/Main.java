//Autor: Matheus Ohrt Perazzo Leite Galvão
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Vetor v = new Vetor();
        int res = 0;


        while(res != 6){
            System.out.println("\nQual a acao deseja fazer?\n1 - Cadastrar nome e valor de um produto\n2 - Listar todos os produtos\n3 - Procurar produto\n4 - Alterar produto\n5 - Remover produto\n6 - Finalizar ");
            res = tc.nextInt();
            switch(res){
                case 1:
                    System.out.println("Insira o nome do produto:");
                    String nome = tc.next();
                    System.out.println("Digite o valor do produto:");
                    Double valor = tc.nextDouble();

                    v.cadastrar(nome, valor);
                    break;

                case 2:
                    System.out.println(v.listar());
                    break;

                case 3:
                    System.out.println(v.procurar());
                    break;

                case 4:
                    v.alterar();
                    break;

                case 5:
                    v.remover();
                    break;

                case 6:
                    System.out.println("Adeus!");
                    break;
            }

        }
    }
}