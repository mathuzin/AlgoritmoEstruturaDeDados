import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Queue<Tarefa> toDoList = new LinkedList<>();
        Stack<Tarefa> done = new Stack<>();
        int res = 0;
        while (res != 6) {
            System.out.println("Escolha a opção que desejar:\n1 - Cadastrar uma tarefa\n2 - Concluir tarefa atual\n3 - Ver próxima tarefa\n4 - Tarefas já concluidas\n5 - Mostrar a lista de tarefas\n6 - Sair");
            res = tc.nextInt();
            switch (res){
                case 1 :
                    System.out.println("Qual tarefa deseja cadastrar?");
                    String task = tc.next();
                    Tarefa tarefa = new Tarefa(task);
                    toDoList.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    done.push(toDoList.peek());
                    System.out.println("A tarefa " + toDoList.poll() + " foi concluida!");
                    break;

                case 3:
                    System.out.println("A proxima tarefa: " + toDoList.peek());
                    break;

                case 4:
                    System.out.println("Tarefas já concluidas: " + done.toString());
                    break;

                case 5:
                    System.out.println("Lista de tarefas:" + toDoList.toString());
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }
    }
}