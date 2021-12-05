import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String name;
    private int Ano;
    private int altura; 
    private int idade; 

    public String getName() {
        return name;
    }

    public int getAno() {
        return Ano;
    }

    public int getAltura() {
        return altura;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    public void Idade(){
        int i = this.Ano;
        this.idade = 2021-i;
    }

    public void ListarDados(){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " cm");
    }


    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.name = leitura.readLine();
        String n = leitura.readLine();
        obj.Ano = Integer.parseInt(n);
        String m = leitura.readLine();
        obj.altura = Integer.parseInt(m);

        obj.Idade(); 
        obj.ListarDados(); 
        
        leitura.close();
        ler.close();
    }
}