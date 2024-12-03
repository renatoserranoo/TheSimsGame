package view;

import model.Sim;

public class GameView {
    public void exibirStatusSim(Sim sim) {
        System.out.println("\nStatus de " + sim.getNome() + ":");
        System.out.println("Aspiração: " + sim.getAspiracao());
        System.out.println("Energia: " + sim.getEnergia() + "%");
        System.out.println("Higiene: " + sim.getHigiene() + "%");
        System.out.println("Simoleons: §" + sim.getSimoleons());
        System.out.println("Nível de Habilidade: " + sim.getNivelHabilidade());
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}