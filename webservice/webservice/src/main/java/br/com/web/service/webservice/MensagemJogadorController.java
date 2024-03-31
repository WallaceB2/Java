package br.com.web.service.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class MensagemJogadorController {

    private static final String[] NOMES = {"Cássio Ramos", "Neymar Jr", "Roberto Firmino", "Philippe Coutinho", "Gabriel Jesus"};
    private static final String[] POSICOES = {"goleiro", "atacante", "meio-campista", "zagueiro", "lateral"};
    private static final String[] CLUBES = {"Corinthians", "Paris Saint-Germain", "Liverpool", "Barcelona", "Manchester City"};
    private Random random = new Random();

    @GetMapping("/mensagem") //só acessar http://localhost:8080/mensagem para ver a mensagem
    public String gerarMensagemJogador() {
        String nome = NOMES[random.nextInt(NOMES.length)];
        int idade = random.nextInt(24) + 17; // Gera idade entre 17 e 40
        String posicao = POSICOES[random.nextInt(POSICOES.length)];
        String clube = CLUBES[random.nextInt(CLUBES.length)];

        return nome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
}