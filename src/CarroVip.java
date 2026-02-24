public class CarroVip extends Veiculo {
    private double taxaVip;


    public CarroVip(String modelo, String placa, double preco) {
        super(modelo, placa, preco);
    }


    public double getTaxaVip() {
        return taxaVip;
    }

    public void setTaxaVip(double taxaVip) {
        this.taxaVip = taxaVip;
    }


    @Override
    public double calcularCusto() {
        return getPrecoPorViagem() + taxaVip;
    }
}