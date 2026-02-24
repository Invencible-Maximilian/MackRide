public abstract class Veiculo {
    private String modelo;
    private String placa;
    private double precoPorViagem;


    public Veiculo(String modelo, String placa, double precoPorViagem) {
        setModelo(modelo);
        setPlaca(placa);
        setPrecoPorViagem(precoPorViagem);
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public double getPrecoPorViagem() {
        return precoPorViagem;
    }

    public void setPrecoPorViagem(double precoPorViagem) {
        this.precoPorViagem = precoPorViagem;
    }

    public abstract double calcularCusto();
}