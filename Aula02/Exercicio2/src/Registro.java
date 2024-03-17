public class Registro {
    String nome;

    public Registro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome do produto: " + nome + "\n";
    }
}
