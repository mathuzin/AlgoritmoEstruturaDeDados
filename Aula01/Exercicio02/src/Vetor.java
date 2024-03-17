//Autor: Matheus Ohrt Perazzo Leite Galvão

import java.util.Arrays;
import java.util.Scanner;


public class Vetor {
    String[] nomeProduto;
    double[] valorProduto;
    Scanner tc = new Scanner(System.in);

    public Vetor() {
        this.nomeProduto = new String[0];
        this.valorProduto = new double[0];
    }

    public void cadastrar(String nomeProduto, double valorProduto){
        int tamanho = this.nomeProduto.length;
        tamanho++;

        String[] vetorTemp = new String[tamanho];
        double[] vetorTempo = new double[tamanho];

        for (int i = 0;i < this.nomeProduto.length; i++) {
            vetorTemp[i] = this.nomeProduto[i];
            vetorTempo[i] = this.valorProduto[i];
        }

        vetorTemp[tamanho - 1] = nomeProduto;
        vetorTempo[tamanho - 1] = valorProduto;

        this.nomeProduto = vetorTemp;
        this.valorProduto = vetorTempo;

    }

    public String listar() {
        //Usei StringBuilder porque não estava indo sem, entao, procurei na internet para resolver
        StringBuilder retorno = new StringBuilder();
        for(int i = 0; i < this.nomeProduto.length; i++){
            if(this.nomeProduto[i] != null){
                retorno.append("\nProduto: ").append(nomeProduto[i]).append(", Preco: R$").append(valorProduto[i]);
            }
        }

        return retorno.toString();
    }

    public String procurar(){
        System.out.println("Insira a palavra que deseja procurar:");
        String chave = tc.next();
        StringBuilder retorno = new StringBuilder();
        for (int i = 0; i < this.nomeProduto.length; i++) {
            if(this.nomeProduto[i].contains(chave)){
                retorno.append("\nProdutos que contem a palavra chave digitada: ").append(nomeProduto[i]).append(", Preco: R$").append(valorProduto[i]);
            } else {
                retorno.append("\nProduto nao encontrado.");
            }


        }

        return retorno.toString();
    }

    public void alterar(){
        System.out.println("Insira o nome do produto que deseja alterar:");
        String chave = tc.next();

        for (int i = 0; i < this.nomeProduto.length; i++) {
            if(this.nomeProduto[i].equals(chave)){
                System.out.println("Insira o nome do produto:");
                String nome = tc.next();
                System.out.println("Insira o valor do produto:");
                Double valor = tc.nextDouble();
                this.nomeProduto[i] = nome;
                this.valorProduto[i] = valor;
                
            }else{
                break;
            }

        }
    }

    public void remover(){
        System.out.println("Digite o nome do produto que deseja remover:");
        String chave = tc.next();

        int indice = -1;

        for (int i = 0; i < this.nomeProduto.length; i++) {
            if(this.nomeProduto[i] != null && this.nomeProduto[i].equals(chave)){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            this.nomeProduto[indice] = null;
            this.valorProduto[indice] = 0;

            System.out.println("Produto removido com sucesso.");

            for (int i = indice; i < this.nomeProduto.length - 1; i++){
                this.nomeProduto[i] = this.nomeProduto[i + 1];
                this.nomeProduto[i + 1] = null;
                this.valorProduto[i] = this.valorProduto[i + 1];
                this.valorProduto[i + 1] = 0;
            }
        }else{
            System.out.println("Produto nao encontrado.");


        }
    }


    }
