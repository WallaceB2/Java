package wallace.livraria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import wallace.livraria.entity.Autor;
import wallace.livraria.entity.Livro;
import wallace.livraria.repository.AutorRepository;
import wallace.livraria.repository.LivroRepository;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;
    @Override
    public void run(String... args) throws Exception {

        Autor a1 = new Autor(null, "Wallace");
        Autor a2 = new Autor(null, "Kerolaine");

        autorRepository.saveAll(Arrays.asList(a1, a2));

        Livro l1 = new Livro(null, "Senhor dos Aneis", a1);
        Livro l2 = new Livro(null, "Retorno do Rei", a2);

        livroRepository.saveAll(Arrays.asList(l1, l2));
    }
}
