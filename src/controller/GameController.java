package controller;

import model.*;
import view.GameView;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    private List<Sim> sims;
    private List<Relacionamento> relacionamentos;
    private GameView view;
    private int turnoAtual;

    public GameController() {
        this.sims = new ArrayList<>();
        this.relacionamentos = new ArrayList<>();
        this.view = new GameView();
        this.turnoAtual = 0;
    }

    public void criarSim(String nome, String aspiracao) {
        Sim novoSim = new Sim(nome, aspiracao);
        sims.add(novoSim);
        view.exibirMensagem("Sim criado com sucesso: " + nome);
    }

    public void criarRelacionamento(Sim sim1, Sim sim2) {
        Relacionamento novoRelacionamento = new Relacionamento(sim1, sim2);
        relacionamentos.add(novoRelacionamento);
    }

    public void gerenciarTurno() {
        turnoAtual++;
        view.exibirMensagem("\n=== Turno " + turnoAtual + " ===");

        for (Sim sim : sims) {
            view.exibirStatusSim(sim);
        }
    }

    public void realizarAcaoSim(Sim sim, String acao) {
        sim.realizarAcao(acao);
        view.exibirStatusSim(sim);
    }

    public void interagirSims(Sim sim1, Sim sim2, String tipoInteracao) {
        for (Relacionamento rel : relacionamentos) {
            if ((rel.getSim1() == sim1 && rel.getSim2() == sim2) ||
                    (rel.getSim1() == sim2 && rel.getSim2() == sim1)) {
                rel.interagir(tipoInteracao);
                view.exibirMensagem("Interação realizada: " + tipoInteracao);
                return;
            }
        }
    }

    public List<Sim> getSims() {
        return sims;
    }
}