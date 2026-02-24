public class Motorista extends Usuario {
    private String cnh;
    private double notaMedia;


    public Motorista(String nome, String email, String cnh, double notaMedia) {
        super(nome, email);
        setCnh(cnh);
        setNotaMedia(notaMedia);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }


    @Override
    public void tipoUsuario() {
        System.out.println("Motorista");
    }
}