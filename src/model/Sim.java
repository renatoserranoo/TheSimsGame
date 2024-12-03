package model;

public class Sim {
    private String nome;
    private String aspiracao;
    private int energia;
    private int higiene;
    private int simoleons;
    private int idade;
    private int nivelHabilidade;

    public Sim(String nome, String aspiracao) {
        this.nome = nome;
        this.aspiracao = aspiracao;
        this.energia = 100;
        this.higiene = 100;
        this.simoleons = 1000;
        this.idade = 0;
        this.nivelHabilidade = 0;
    }

    public void realizarAcao(String acao) {
        switch (acao.toLowerCase()) {
            case "dormir":
                dormir();
                break;
            case "trabalhar":
                trabalhar();
                break;
            case "treinar":
                treinar();
                break;
            default:
                System.out.println("Ação inválida!");
        }
        atualizarAtributos();
    }

    private void dormir() {
        energia = Math.min(energia + 30, 100);
    }

    private void trabalhar() {
        energia -= 20;
        simoleons += 100;
    }

    private void treinar() {
        energia -= 15;
        nivelHabilidade++;
    }

    private void atualizarAtributos() {
        higiene = Math.max(0, higiene - 10);
        energia = Math.max(0, energia);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getAspiracao() { return aspiracao; }
    public int getEnergia() { return energia; }
    public int getHigiene() { return higiene; }
    public int getSimoleons() { return simoleons; }
    public int getIdade() { return idade; }
    public int getNivelHabilidade() { return nivelHabilidade; }

    public void setEnergia(int energia) { this.energia = energia; }
    public void setHigiene(int higiene) { this.higiene = higiene; }
    public void setSimoleons(int simoleons) { this.simoleons = simoleons; }
}