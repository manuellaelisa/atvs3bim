public class Elevador {
    int andarat, andartot, capacidade, pessoas;

    public void inicio(int c, int t) {
        this.andarat = 0;
        this.pessoas = 0;
        this.andartot = t;
        this.capacidade = c;
    }

    public void entra() {
        if (pessoas < capacidade) {
            pessoas = pessoas + 1;
        } else {
            System.out.println("Elevador cheio");
        }
    }

    public void sai() {
        if (pessoas > 0) {
            pessoas = pessoas - 1;
        } else {
            System.out.println("Elevador já vazio");
        }
    }

    public void sobe() {
        if (andarat < andartot) {
            andarat = andarat + 1;
        } else {
            System.out.println("Andar maximo");
        }
    }

    public void desce() {
        if (andarat > 0) {
            andarat = andarat - 1;
        } else {
            System.out.println("Terreo");
        }
    }

    public int getAt() {
        return andarat;
    }

    public int getTot() {
        return andartot;
    }

    public int getCAt() {
        return pessoasAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int x) {
        this.capacidade = x;
    }

    public void setTot(int x) {
        this.andartot = x;
    }

    public void setCAt(int x) {
        this.pessoasat = x;
    }

    public void setAt(int x) {
        this.andarat = x;
    }

}