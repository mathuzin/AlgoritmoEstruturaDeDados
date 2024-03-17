import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int res = 0;
        ArrayList<Registro>  registros = new ArrayList<>();

        while(res != 6){
            System.out.println("Escolha a opção que desejar:\n1 - Cadastrar um produto\n2 - Selecionar todos os registros\n3 - Quantidade de segmentos\n4 - Alterar dados\n5 - Remover\n6 - Sair");
            res = tc.nextInt();
            switch(res){
                case 1:
                    System.out.println("Insira o nome do produto:");
                    String nome = tc.next();
                    System.out.println("Insira o segmento do produto:");
                    String segmento = tc.next();
                    Registro registro = new Registro(nome, segmento);
                    registros.add(registro);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Registro dos produtos:\n " + registros.toString());
                    break;

                case 3:
                    HashMap<String, Integer> quantidadePorSegmento = new HashMap<>();
                    for (Registro r : registros){
                        String segmentoAtual = r.getSegmento();
                        if(quantidadePorSegmento.containsKey(segmentoAtual)){
                            quantidadePorSegmento.put(segmentoAtual, quantidadePorSegmento.get(segmentoAtual) + 1);
                        } else {
                            quantidadePorSegmento.put(segmentoAtual, 1);
                        }
                    }
                    for (Map.Entry<String,Integer> entry : quantidadePorSegmento.entrySet()) {
                        System.out.println("Segmento: " + entry.getKey() +  " -  Quantidade de produtos: " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do produto que deseja alterar dos dados:");
                    String procura = tc.next();
                    Iterator<Registro> iterator = registros.iterator();
                    boolean produtoEncontrado = false;
                    while(iterator.hasNext()){
                        Registro r = iterator.next();
                        if(procura.equals(r.getNome())){
                            System.out.println("Entre com o novo nome do produto:");
                            String novoNome = tc.next();
                            System.out.println("Entre com o novo segmento do produto:");
                            String novoSegmento = tc.next();
                            r.setNome(novoNome);
                            r.setSegmento(novoSegmento);
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
                    boolean produtoEncontradoRemover = false;
                    Iterator<Registro> iteratorRemover = registros.iterator();
                    while(iteratorRemover.hasNext()){
                        Registro r1 = iteratorRemover.next();
                        if(procura.equals(r1.getNome())){
                            iteratorRemover.remove();
                            produtoEncontradoRemover = true;
                            System.out.println("Produto removido com sucesso.!");
                            break;
                        }
                    }
                    if(!produtoEncontradoRemover){
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