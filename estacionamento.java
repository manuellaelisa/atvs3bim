import java.io.*;
import java.util.Scanner;

public class Estacionamento{ 
    private String p;
    private String m;
    private int e; 
    private int s; 
    private double v;

    public String getPlaca() {
        return p;
    }
    public void setPlaca(String a) {
        this.p = a;
    }

    //
    public String getModelo() {
        return m;
    }
    public void setModelo(String a) {
        this.m = a;
    }

    //
    public int getEntrada() {
        return e;
    }
    public void setEntrada(int a) {
        this.e = a;
    }

    //
    public int getSaida() {
        return s;
    }
    public void setSaida(int a) {
        this.s = a;
    }

    public void Inicializa(){
        this.p = "";
        this.m = "";
        this.e = 0;
        this.s = 0;
    }

    public void Pagamento(){
        int i = this.e;
        int j = this.s; 
        this.v = (s - e)*1.5;
    }

    public void ListarDados(){
        System.out.println("Placa: " + this.p);
        System.out.println("Modelo: " + this.m);
        System.out.println("Entrada: " + this.e + " horas");
        System.out.println("Saida: " + this.s + " horas");
        System.out.println("Valor do estacionamento: " + this.v + " reais");
    }


    public static void main(String args[]) throws IOException {
        Estacionamento obj = new Estacionamento();

        Scanner ler = new Scanner(System.in);
        String e = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(e));

        obj.Inicializa();

        obj.p = leitura.readLine(); 
        obj.m = leitura.readLine(); 

        String n = leitura.readLine();
        obj.e = Integer.parseInt(n);
        String m = l.readLine();
        obj.saida = Integer.parseInt(m);

        obj.Pagamento();
        obj.ListarDados();

        leitura.close();
        ler.close();
    }
}