import javax.swing.*;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    //Contrutor
    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false; // toda tarefa começa pendente
    }

    //METODOS GET E SET
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao () { return titulo; }
    public boolean getConcluida() { return concluida; }

    public void setConcluida( boolean concluida ) { this.concluida = concluida; }

    //Metodo para exibir detalhes
    /* public void exibir(){
        System.out.println("------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + (concluida ? "Concluido" : "Pendente"));/*/

        public void exibir(){
            JOptionPane.showMessageDialog(null, "ID: " + id +
                    "\nTitulo: " + titulo + "\nDescrição: " + descricao +
                    "\nStatus: " + (concluida ? "Concluida" : "Pendente"));
    }
}
