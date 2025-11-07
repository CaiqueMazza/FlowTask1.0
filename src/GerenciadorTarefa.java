import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefa {
    private List<Tarefa> lista = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarTarefa(String titulo, String descricao){
        Tarefa nova = new Tarefa(proximoId++, titulo, descricao);
        lista.add(nova);
        System.out.println("Tarefa adiconada com sucesso!");
    }

    public void listarTarefa(){
        if (lista.isEmpty()) { JOptionPane.showMessageDialog(null,"Não a Tarefas cadastradas", "FlowTask", JOptionPane.ERROR_MESSAGE);
            return; }

        for (Tarefa t : lista){ t.exibir();}
    }

    public void concluirTarefa(int id){
        for (Tarefa t : lista){
            if (t.getId() == id){ t.setConcluida(true); System.out.println("Tarefa marcada como concluida");
            return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void removerTarefa(int id){
        lista.removeIf(t -> t.getId() == id);
        System.out.println("Tarefa removida!");
    }
}
