import java.io.*;
import java.util.*;


public class Persistencia {


    public static void salvarMotoristas(List<Motorista> lista, String arquivo) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
        for (Motorista m : lista) {
            bw.write(m.getNome() + ";" + m.getEmail() + ";" + m.getCnh() + ";" + m.getNotaMedia());
            bw.newLine();
        }
        bw.close();
    }


    public static ArrayList<Motorista> carregarMotoristas(String arquivo) throws Exception {
        ArrayList<Motorista> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] p = linha.split(";");
            lista.add(new Motorista(p[0], p[1], p[2], Double.parseDouble(p[3])));
        }
        br.close();
        return lista;
    }


    public static void salvarPassageiros(List<Passageiro> lista, String arquivo) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
        for (Passageiro p : lista) {
            bw.write(p.getNome() + ";" + p.getEmail());
            for (String h : p.getHistoricoViagens()) bw.write(";" + h);
            bw.newLine();
        }
        bw.close();
    }


    public static ArrayList<Passageiro> carregarPassageiros(String arquivo) throws Exception {
        ArrayList<Passageiro> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] p = linha.split(";");
            Passageiro pass = new Passageiro(p[0], p[1]);
            for (int i = 2; i < p.length; i++) pass.getHistoricoViagens().add(p[i]);
            lista.add(pass);
        }
        br.close();
        return lista;
    }


    public static void salvarVeiculos(List<Veiculo> lista, String arquivo) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
        for (Veiculo v : lista) {
            if (v instanceof CarroComum) {
                bw.write("COMUM;" + v.getModelo() + ";" + v.getPlaca() + ";" + v.getPrecoPorViagem());
            } else {
                bw.write("VIP;" + v.getModelo() + ";" + v.getPlaca() + ";" + v.getPrecoPorViagem());
            }
            bw.newLine();
        }
        bw.close();
    }
    public static ArrayList<Veiculo> carregarVeiculos(String arquivo) throws Exception {
        ArrayList<Veiculo> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] p = linha.split(";");
            if (p[0].equals("COMUM")) lista.add(new CarroComum(p[1], p[2], Double.parseDouble(p[3])));
            else lista.add(new CarroVip(p[1], p[2], Double.parseDouble(p[3])));
        }
        br.close();
        return lista;
    }
}