import controller.GameController;
import model.Cheats;
import model.Sim;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do simulador
        GameController controller = new GameController();

        // Criando Sims
        controller.criarSim("Ana", "Culinária");
        controller.criarSim("João", "Música");

        // Obtendo os Sims criados
        Sim ana = controller.getSims().get(0);
        Sim joao = controller.getSims().get(1);

        // Criando relacionamento entre Ana e João
        controller.criarRelacionamento(ana, joao);

        // Simulando algumas ações
        controller.realizarAcaoSim(ana, "treinar");
        controller.realizarAcaoSim(joao, "trabalhar");

        // Interação entre Sims
        controller.interagirSims(ana, joao, "conversar");

        // Usando cheats
        Cheats.adicionarSimoleons(ana, 5000);

        // Avançando um turno
        controller.gerenciarTurno();
    }
}