import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Motorista> motoristas = new ArrayList<>();
        ArrayList<Passageiro> passageiros = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();


        try {
            motoristas.add(new Motorista("Matheus Leite", "matheus.leite@gmail.com", "1234", 5.0));
            passageiros.add(new Passageiro("Italo Reis", "italo.reis@gmail.com"));
            veiculos.add(new CarroComum("Onix LTZ", "FPS4131", 20));
            veiculos.add(new CarroVip("Corolla Cross", "BTC2982", 40));


            ReservarViagem r = new ReservarViagem(passageiros.get(0), veiculos.get(1), LocalDate.now());
            System.out.println("Custo viagem: " + r.calcularCusto(true));

            // Exemplificando classe Persistencia
            Persistencia.salvarMotoristas(motoristas, "motoristas.txt");
            Persistencia.salvarPassageiros(passageiros, "passageiros.txt");
            Persistencia.salvarVeiculos(veiculos, "veiculos.txt");

            System.out.println("Arquivos salvos com sucesso!");

            
            ArrayList<Motorista> motoristasCarregados =
                    Persistencia.carregarMotoristas("motoristas.txt");

            ArrayList<Passageiro> passageirosCarregados =
                    Persistencia.carregarPassageiros("passageiros.txt");

            ArrayList<Veiculo> veiculosCarregados =
                    Persistencia.carregarVeiculos("veiculos.txt");

            // PRINT NO QUE FOI CARREGADO
            System.out.println("\n--- MOTORISTAS CARREGADOS ---");
            for (Motorista m : motoristasCarregados) {
                System.out.println(m.getNome() + " - " + m.getCnh());
            }

            System.out.println("\n--- PASSAGEIROS CARREGADOS ---");
            for (Passageiro p : passageirosCarregados) {
                System.out.println(p.getNome() + " - Histórico: " + p.getHistoricoViagens());
            }

            System.out.println("\n--- VEÍCULOS CARREGADOS ---");
            for (Veiculo v : veiculosCarregados) {
                System.out.println(v.getModelo() + " - " + v.getPlaca());
            }


        } catch (Exception e) {
            System.out.println("Desculpe, ocorreu um erro; erro: " + e.getMessage());
        }
    }
}