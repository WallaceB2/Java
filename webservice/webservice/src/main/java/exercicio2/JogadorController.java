package exercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JogadorController {

    @GetMapping("/jogadores")
    public List<Jogador> getJogadores() {
        JavaExercicioJogador.realizarRequisicao();
        return JavaExercicioJogador.getJogadores();
    }
}