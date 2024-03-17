import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int res = 0;
        LinkedList<Lista> lista = new LinkedList<>();

        while (res != 3){
            System.out.println("Escolha a opção que desejar\n1 - Cadastrar um nome\n2 - Listar os nomes\n3 - Sair");
            res = tc.nextInt();
            switch (res){
                case 1:
                    System.out.println("Insira o nome que deseja cadastrar:");
                    String nome = tc.next();
                    Lista name = new Lista(nome);
                    lista.add(name);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista dos nomes cadastrados: \n" + lista.toString());
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }
    }
}