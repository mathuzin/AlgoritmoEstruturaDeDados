public class Registro {
    String nome;
    String segmento;

    public Registro(String nome, String segmento) {
        this.nome = nome;
        this.segmento = segmento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + nome + " | Segmento do produto: " + segmento + "\n";
    }
}
