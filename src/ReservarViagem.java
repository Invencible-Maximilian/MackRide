import java.time.LocalDate;


public class ReservarViagem {
    private Passageiro passageiro;
    private Veiculo veiculo;
    private LocalDate data;


    public ReservarViagem(Passageiro passageiro, Veiculo veiculo, LocalDate data) {
        this.passageiro = passageiro;
        this.veiculo = veiculo;
        this.data = data;
        passageiro.adicionarViagem(veiculo.getModelo(), data);
    }


    public double calcularCusto() {
        return veiculo.calcularCusto();
    }


    public double calcularCusto(boolean taxa) {
        double custo = veiculo.calcularCusto();
        if (taxa) custo += 7;
        return custo;
    }
}