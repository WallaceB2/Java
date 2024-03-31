package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaExercicioJogador {

    private static boolean requisicaoFeita = false;
    private static final List<Jogador> jogadores = new ArrayList<>();
    private static final String[] POSICOES = {"goleiro", "atacante", "meio-campista", "zagueiro", "lateral"};
    private static final String[] CLUBES = {"Corinthians", "Paris Saint-Germain", "Liverpool", "Barcelona", "Manchester City"};

    public static void realizarRequisicao() {
        if (!requisicaoFeita) {
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                String nome = "Jogador" + i;
                String sobrenome = "Sobrenome" + i;
                int idade = random.nextInt(24) + 17;
                String posicao = POSICOES[random.nextInt(POSICOES.length)];
                String clube = CLUBES[random.nextInt(CLUBES.length)];
                Jogador jogador = new Jogador(nome, sobrenome, idade, posicao, clube);
                jogadores.add(jogador);
            }
            requisicaoFeita = true;
        }
    }

    public static List<Jogador> getJogadores() {
        return jogadores;
    }
}