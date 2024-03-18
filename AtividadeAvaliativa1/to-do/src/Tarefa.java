public class Tarefa {
    String tarefa;

    public Tarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String toString(){
        return getTarefa();
    }
}
