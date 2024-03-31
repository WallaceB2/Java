package exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceApplication {

    public static void main(String[] args) {
        JavaExercicioJogador.realizarRequisicao();
        SpringApplication.run(WebserviceApplication.class, args);
    }
}