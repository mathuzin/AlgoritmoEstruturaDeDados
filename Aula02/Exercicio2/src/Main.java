import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int res = 0;
        Vector<Registro> registros = new Vector<>();

        while (res != 6){
            System.out.println("Escolha a opção que desejar\n1 - Cadastrar produto\n2 - Selecionar todos os produtos\n3 - Pesquisar um produto no registro\n4 - Alterar dados\n5 - Remover\n6 - Sair");
            res = tc.nextInt();
            switch (res){
                case 1:
                    System.out.println("Insira o nome do produto:");
                    String nome = tc.next();
                    boolean produtoEncontrado = false;
                    for(Registro rr : registros) {
                        if (rr.getNome().equals(nome)) {
                            System.out.println("Esse produto já foi cadastrado.");
                            produtoEncontrado = true;
                            break;
                        }
                    }
                    if(!produtoEncontrado){
                        Registro registro = new Registro(nome);
                        registros.add(registro);
                        System.out.println("Produto adicionado com sucesso!");
                    }

                    break;

                case 2:
                    System.out.println("Registro dos produtos:\n" + registros.toString());
                    break;

                case 3:
                    System.out.println("Digite o termo  que deseja procurar no registro:");
                    String procura = tc.next();
                    produtoEncontrado = false;
                    for(Registro r1 : registros){
                        if(r1.getNome().contains(procura)){
                            System.out.println("Produtos que contem o termo: " + r1.getNome());
                            produtoEncontrado = true;
                        }
                    }

                    if(!produtoEncontrado){
                        System.out.println("Não há nenhum produto com esse termo.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do produto que deseja alterar:");
                    procura = tc.next();
                    Iterator<Registro> iterator = registros.iterator();
                    produtoEncontrado = false;

                    while (iterator.hasNext()) {
                        Registro r = iterator.next();
                        if (procura.equals(r.getNome())){
                            System.out.println("Entre com o novo nome do produto:");
                            String novoNome = tc.next();
                            r.setNome(novoNome);
                            produtoEncontrado = true;
                            System.out.println("Produto alterado com sucesso!");
                            break;
                        }
                    }

                    if(!produtoEncontrado){
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 5:
                    System.out.println("Digite o nome do produto que deseja remover do registro:");
                    procura = tc.next();
                    Iterator<Registro> iteratorRemover = registros.iterator();
                    produtoEncontrado = false;
                    while (iteratorRemover.hasNext()){
                        Registro r1 = iteratorRemover.next();
                        if(procura.equals(r1.getNome())){
                            iteratorRemover.remove();
                            System.out.println("Produto removido com sucesso!");
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if(!produtoEncontrado){
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Adeus!");
                    break;
            }

        }
    }
}