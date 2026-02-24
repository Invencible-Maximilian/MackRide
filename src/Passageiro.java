import java.time.LocalDate;
import java.util.ArrayList;


public class Passageiro extends Usuario {
    private ArrayList<String> historico = new ArrayList<>();


    public Passageiro(String nome, String email) {
        super(nome, email);
    }


    public void adicionarViagem(String origem, LocalDate data) {
        historico.add(origem + " - " + data);
    }


    public ArrayList<String> getHistoricoViagens() {
        return historico;
    }


    @Override
    public void tipoUsuario() {
        System.out.println("Passageiro");
    }
}