package wallace.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wallace.livraria.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
