package model;

public class Relacionamento {
    private Sim sim1;
    private Sim sim2;
    private int pontosRelacao;

    public Relacionamento(Sim sim1, Sim sim2) {
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.pontosRelacao = 0;
    }

    public void interagir(String tipoInteracao) {
        switch (tipoInteracao.toLowerCase()) {
            case "conversar":
                pontosRelacao += 10;
                break;
            case "brigar":
                pontosRelacao -= 15;
                break;
            case "abracar":
                pontosRelacao += 15;
                break;
            default:
                System.out.println("Interação inválida!");
        }
        pontosRelacao = Math.max(-100, Math.min(100, pontosRelacao));
    }

    public int getPontosRelacao() { return pontosRelacao; }
    public Sim getSim1() { return sim1; }
    public Sim getSim2() { return sim2; }
}