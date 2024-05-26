package wallace.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wallace.livraria.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
