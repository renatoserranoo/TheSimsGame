package model;

public class Cheats {
    public static void adicionarSimoleons(Sim sim, int quantidade) {
        sim.setSimoleons(sim.getSimoleons() + quantidade);
    }

    public static void alterarEnergia(Sim sim, int quantidade) {
        sim.setEnergia(Math.min(100, Math.max(0, quantidade)));
    }

    public static void alterarHigiene(Sim sim, int quantidade) {
        sim.setHigiene(Math.min(100, Math.max(0, quantidade)));
    }
}