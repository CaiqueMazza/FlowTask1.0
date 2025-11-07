import javax.swing.*;

public class Sistema extends GerenciadorTarefa {
    public void exibirParaoCliente(){

    GerenciadorTarefa  gerenciador = new GerenciadorTarefa();

            while (true){

        Object[] opcoes = {"Adicionar tarefa", "Listar Tarefas", "Concluir Tarefa", "Remover Tarefa", "Sair"};
        int opcaodeTarefas = JOptionPane.showOptionDialog(null, "FLOWTASK", "Qual sua opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);


        switch (opcaodeTarefas){
            case 0:
                String titulo = JOptionPane.showInputDialog(null, "Titulo da Tarefa",
                        "FlowTask",JOptionPane.INFORMATION_MESSAGE);
                String descricao = JOptionPane.showInputDialog(null, "Descrição da Tarefa",
                        "FlowTask",JOptionPane.INFORMATION_MESSAGE);
                gerenciador.adicionarTarefa(titulo, descricao);
                break;

            case 1:
                gerenciador.listarTarefa();
                break;

            case 2:
                String idConcluir = JOptionPane.showInputDialog(null, "ID da tarefa ");
                int conclusao = Integer.parseInt(idConcluir);
                gerenciador.concluirTarefa(conclusao);
                break;

            case 3:
                String idRemover = JOptionPane.showInputDialog(null, "ID da tarefa a remover ");
                int removedor = Integer.parseInt(idRemover);
                gerenciador.removerTarefa(removedor);
                break;

            case 4:
                JOptionPane.showMessageDialog(null,"Sair do FlowTask");
                return;

            default:
                JOptionPane.showMessageDialog(null,"Opção INVALIDA!!");
        }
    }
}
}
