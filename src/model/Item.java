package model;

public class Item {
    private String nome;
    private int custo;
    private int bonus;

    public Item(String nome, int custo, int bonus) {
        this.nome = nome;
        this.custo = custo;
        this.bonus = bonus;
    }

    public void usar(Sim sim) {
        if (sim.getSimoleons() >= custo) {
            sim.setSimoleons(sim.getSimoleons() - custo);
            aplicarBonus(sim);
        } else {
            System.out.println("Simoleons insuficientes!");
        }
    }

    private void aplicarBonus(Sim sim) {
        sim.setEnergia(Math.min(100, sim.getEnergia() + bonus));
    }

    public String getNome() { return nome; }
    public int getCusto() { return custo; }
    public int getBonus() { return bonus; }
}