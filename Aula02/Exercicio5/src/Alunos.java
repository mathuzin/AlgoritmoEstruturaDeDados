public class Alunos {
    String nome;
    int  matricula;
    boolean aprovado;

    public Alunos(String nome, int matricula, boolean aprovado) {
        this.nome = nome;
        this.matricula = matricula;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula:" + matricula + "\nAprovado:" + aprovado + "\n---------------";
    }
}
