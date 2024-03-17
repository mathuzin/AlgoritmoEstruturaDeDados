import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int res = 0;
        HashMap<Integer, Alunos> alunos = new HashMap<>();

        while (res != 6){
            System.out.println("Escolha a opção que desejar:\n1 - Cadastrar aluno\n2 - Ler todos os alunos\n3 - Ler estatísticas da sala\n4 - Alterar aluno\n5 - Remover aluno\n6 - Sair");
            res = tc.nextInt();
            switch (res){
                case 1:
                    System.out.println("Insira o nome do aluno:");
                    String nome = tc.next();
                    System.out.println("Insira a matricula do aluno:");
                    int matricula = tc.nextInt();
                    System.out.println("O aluno foi aprovado?True/False");
                    boolean aprovado = tc.nextBoolean();
                    Alunos aluno = new Alunos(nome,matricula,aprovado);
                    alunos.put(matricula, aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de todos os alunos");
                    for(Map.Entry<Integer, Alunos> a : alunos.entrySet()){
                        System.out.println(a.toString());
                    }
                    break;

                case 3:
                    int reprovados = 0;
                    int passados = 0;
                    for (Map.Entry<Integer, Alunos> gurizada : alunos.entrySet()){
                        if(gurizada.getValue().isAprovado()){
                            passados++;
                        } else {
                            reprovados++;
                        }
                    }
                    System.out.println("Quantidade de alunos: " + alunos.size());
                    System.out.println("Quantidade de alunos aprovados: " + passados);
                    System.out.println("Quantidade de alunos reprovados: " + reprovados);
                    break;

                case 4:
                    System.out.println("Insira a matricula do aluno que você deseja alterar os dados:");
                    int procurar = tc.nextInt();
                    Iterator<Alunos> iterator = alunos.values().iterator();
                    boolean alunoEncontrado = false;
                    while(iterator.hasNext()){
                        Alunos alunos1 = iterator.next();
                        if(procurar == alunos1.getMatricula()){
                            System.out.println("Entre com os novos dados do aluno:");
                            System.out.println("Nome:");
                            String novoNome = tc.next();
                            System.out.println("Aprovados?True/false");
                            boolean passou = tc.nextBoolean();
                            alunos1.setNome(novoNome);
                            alunos1.setAprovado(passou);
                            alunoEncontrado = true;
                            System.out.println("Os dados do aluno foram alterados com sucesso!");
                            break;
                        }
                    }
                    if(!alunoEncontrado){
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Digite a matricula do aluno que deseja remover do sistema:");
                    procurar = tc.nextInt();
                    Iterator<Alunos> iteratorRemover = alunos.values().iterator();
                    alunoEncontrado = false;
                    while (iteratorRemover.hasNext()) {
                        Alunos a1 = iteratorRemover.next();
                        if(procurar == a1.getMatricula()){
                            iteratorRemover.remove();
                            System.out.println("Os dados do aluno foram removidos do sistema.");
                            alunoEncontrado = true;
                            break;
                        }
                    }

                    if(!alunoEncontrado){
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }
    }
}