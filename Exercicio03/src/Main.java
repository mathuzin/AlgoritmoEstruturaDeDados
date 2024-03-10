//Autor: Matheus Ohrt Perazzo Leite Galvão
//Usei Queue, porque nunca havia usado e devido ao fator da remoção ser por ordem de chegada
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Queue<String> nome = new LinkedList<String>();
        int res = 0;
        while(res != 3){
            System.out.println("1 - Cadastrar atendimento\n2 - Remover\n3 - Finalizar");
            res = tc.nextInt();
            switch(res) {
                case 1:
                    System.out.println("Informe o nome da pessoa:");
                    nome.add(tc.next());
                    System.out.println("Fila de atendimento: " + nome);
                    break;

                case 2:
                    System.out.println(nome.poll() + " foi removido da fila de atendimento.");
                    break;

                case 3:
                    break;
            }
        }
    }
}