public class CarroComum extends Veiculo {
    public CarroComum(String modelo, String placa, double preco) {
        super(modelo, placa, preco);
    }


    @Override
    public double calcularCusto() {
        return getPrecoPorViagem();
    }
}

